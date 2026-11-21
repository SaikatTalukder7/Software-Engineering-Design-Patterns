public class Main
{

    public static void main(String[] args) throws InterruptedException
    {

        Thread t1 = new Thread(() -> { PrinterSpooler.getInstance().addJob("Saikat_Report.pdf");
        });

        Thread t2 = new Thread(() -> { PrinterSpooler.getInstance().addJob("Saikat_Assignment.docx");
        });

        Thread t3 = new Thread(() -> { PrinterSpooler.getInstance().addJob("Saikat_Presentation.pptx");
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        PrinterSpooler spooler = PrinterSpooler.getInstance();

        spooler.printAll();
    }
}
