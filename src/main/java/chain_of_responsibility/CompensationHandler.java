package chain_of_responsibility;

public class CompensationHandler extends Handler {
    @Override
    public void process(Message message) {
        if (message.getType()==MessageType.COMPENSATION) {
            System.out.println("CompensationHandler is processing the message: " + message);
        } else {
            System.out.println("CompensationHandler cannot process the message: " + message);
            super.process(message);
        }
    }


}
