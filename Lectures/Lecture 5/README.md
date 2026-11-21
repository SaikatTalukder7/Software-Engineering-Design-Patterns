## **Problem: Print Spooler Manager**

A shared office printer needs exactly one spooler managing its job queue, no matter how many programs try to print at once.

- Create class `PrinterSpooler` implementing the Singleton pattern using DOUBLE-CHECKED LOCKING (private constructor, private static volatile instance field, public static `getInstance()` with the two-check pattern shown above).
- The constructor should print exactly: `"Print spooler initialized."`
- Add an instance field `List<String> jobQueue` (use `java.util.ArrayList`), and a method `addJob(String documentName)` that adds the job and prints `"Queued: " + documentName + " (queue size: " + size + ")"`.
- Add a method `printAll()` that prints every queued document name in order, then clears the queue.
- In Main, create THREE separate threads, each calling `PrinterSpooler.getInstance()` and then `addJob(...)` with a DIFFERENT document name. Join all threads, then call `printAll()` once from the main thread using the same shared instance.
- Prove in your printed output that `"Print spooler initialized."` appears exactly ONCE even though three threads called `getInstance()` concurrently.
