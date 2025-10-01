package mediator;

public interface IMediator {
    void sendMessage(String message, String sender, String receiver);
    void addClient(String username, mediator.controller.Controller controller);
}

