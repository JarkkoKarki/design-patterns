package chain_of_responsibility;

public class GeneralHandler extends Handler {
    @Override
    public void process(Message message) {
        if (message.getType()==MessageType.GENERAL) {
            System.out.println("GeneralHandler is processing the message: " + message);
        } else {
            System.out.println("GeneralHandler cannot process the message: " + message);
            super.process(message);
        }
    }
}
