package decorator;
public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Test");

        //XML
        Printer printer1 = new XMLPrinter(new BasicPrinter());
        printer1.print("Test");

        //XML + Encrypt
        Printer printer2 = new XMLPrinter(new EncryptedPrinter(new BasicPrinter()));
        printer2.print("Test");

        //Decrypt
        Printer printer3 = new DecryptedPrinter(new BasicPrinter());
        printer3.print("Uftu");

    }
}


