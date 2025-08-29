package decorator;

public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        decoratedPrinter.print(encryptedMessage);
    }

    private String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }
}
