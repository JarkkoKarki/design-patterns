package mediator.view;

import javafx.scene.control.TextArea;

public class ClientGui {
    private final TextArea textArea;

    public ClientGui(TextArea textArea) {
        this.textArea = textArea;
    }

    public void displayMessage(String sender, String message) {
        textArea.appendText(sender + ": " + message + "\n");
    }
}
