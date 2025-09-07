package chain_of_responsibility;

public class SuggestionHandler extends Handler {
    @Override
    public void process(Message message) {
        if (message.getType()==MessageType.SUGGESTION) {
            System.out.println("SuggestionHandler is processing the message: " + message);
        } else {
            System.out.println("SuggestionHandler cannot process the message: " + message);
            super.process(message);
        }
    }
}
