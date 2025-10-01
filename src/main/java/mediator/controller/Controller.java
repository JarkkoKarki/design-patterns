package mediator.controller;

import mediator.Mediator;
import mediator.view.ClientGui;

public class Controller {
    private final String username;
    private final Mediator mediator;
    private ClientGui gui;

    public Controller(String username, Mediator mediator) {
        this.username = username;
        this.mediator = mediator;
    }

    public void setGui(ClientGui gui) {
        this.gui = gui;
    }

    public void sendMessage(String receiver, String message) {
        mediator.sendMessage(message, username, receiver);
    }

    public void receiveMessage(String sender, String message) {
        gui.displayMessage(sender, message);
    }
}
