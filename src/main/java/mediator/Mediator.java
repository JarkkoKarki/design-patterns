package mediator;

import mediator.controller.Controller;
import java.util.HashMap;
import java.util.Map;

public class Mediator implements IMediator {
    private final Map<String, Controller> clients = new HashMap<>();

    @Override
    public void sendMessage(String message, String sender, String receiver) {
        Controller client = clients.get(receiver);
        if (client != null) {
            client.receiveMessage(sender, message);
        }
    }

    @Override
    public void addClient(String username, Controller controller) {
        clients.put(username, controller);
    }
}
