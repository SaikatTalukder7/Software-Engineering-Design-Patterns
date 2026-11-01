interface OfficeMachine {
    void print();
    void scan();
    void fax();
}

class SimplePrinter implements OfficeMachine {
    public void print() {
        System.out.println("Simple Printer is printing.");
    }

    public void scan() {
        throw new UnsupportedOperationException("Simple Printer cannot scan.");
    }

    public void fax() {
        throw new UnsupportedOperationException("Simple Printer cannot fax.");
    }
}

class AllInOnePrinter implements OfficeMachine {
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

public class MainBefore {
    public static void main(String[] args) {

        OfficeMachine printer = new SimplePrinter();

        printer.print();
        printer.scan();
    }
}