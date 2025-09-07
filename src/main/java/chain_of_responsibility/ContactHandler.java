package chain_of_responsibility;

public class ContactHandler extends Handler {
    @Override
    public void process(Message message) {
        if (message.getType()==MessageType.CONTACT) {
            System.out.println("ContactHandler is processing the message: " + message);
        } else {
            System.out.println("ContactHandler cannot process the message: " + message);
            super.process(message);
        }
    }
}
