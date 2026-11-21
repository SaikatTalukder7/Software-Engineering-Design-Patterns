import java.util.ArrayList;
import java.util.List;

public class PrinterSpooler
{
    private static volatile PrinterSpooler instance;
    private final List<String> jobQueue;
    private PrinterSpooler()
    {
        jobQueue = new ArrayList<>();
        System.out.println("Print spooler initialized.");
    }

    public static PrinterSpooler getInstance()
    {
        if (instance != null)
        {
            return instance;
        }
        synchronized (PrinterSpooler.class)
        {
            if (instance == null)
            {
                instance = new PrinterSpooler();
            }
            return instance;
        }
    }

    public synchronized void addJob(String documentName)
    {
        jobQueue.add(documentName);
        int totalJobs = jobQueue.size();
        System.out.println("Queued: " + documentName + " (queue size: " + totalJobs + ")");
    }

    public synchronized void printAll()
    {

        for (int i = 0; i < jobQueue.size(); i++)
        {
            System.out.println(jobQueue.get(i));
        }
        jobQueue.clear();
    }
}
