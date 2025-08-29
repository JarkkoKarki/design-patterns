package decorator;

public class DecryptedPrinter extends PrinterDecorator {
    public DecryptedPrinter(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    @Override
    public void print(String message) {
        String decryptedMessage = decrypt(message);
        decoratedPrinter.print(decryptedMessage);
    }

    private String decrypt(String message) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            decrypted.append((char) (c - 1));
        }
        return decrypted.toString();
    }
}