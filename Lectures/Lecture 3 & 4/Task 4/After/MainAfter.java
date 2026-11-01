interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class SimplePrinter implements Printable {
    public void print() {
        System.out.println("Simple Printer is printing.");
    }
}

class AllInOnePrinter implements Printable, Scannable, Faxable {
    public void print() {
        System.out.println("All-in-One Printer is printing.");
    }

    public void scan() {
        System.out.println("All-in-One Printer is scanning.");
    }

    public void fax() {
        System.out.println("All-in-One Printer is faxing.");
    }
}

public class MainAfter {
    public static void main(String[] args) {

        SimplePrinter printer1 = new SimplePrinter();
        printer1.print();

        AllInOnePrinter printer2 = new AllInOnePrinter();
        printer2.print();
        printer2.scan();
        printer2.fax();
    }
}