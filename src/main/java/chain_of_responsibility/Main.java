package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Message[] messages = {
                new Message(MessageType.COMPENSATION, "Compensation message 1", "UserA"),
                new Message(MessageType.CONTACT, "Contact message 1", "UserB"),
                new Message(MessageType.SUGGESTION, "Suggestion message 1", "UserC"),
                new Message(MessageType.GENERAL, "General message 1", "UserD"),
        };

        Handler primaryHandler;
        Handler compensationHandler = new CompensationHandler();
        Handler contactHandler = new ContactHandler();
        Handler suggestionHandler = new SuggestionHandler();
        Handler generalHandler = new GeneralHandler();
        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(suggestionHandler);
        suggestionHandler.setNextHandler(generalHandler);


        primaryHandler = compensationHandler;
        for (Message message : messages) {
            primaryHandler.process(message);
            System.out.println("-----");
        }

    }
}
