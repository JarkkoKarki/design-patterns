package mediator.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import mediator.Mediator;
import mediator.controller.Controller;

public class Gui extends Application {

    public static String[] usernames;
    private static Mediator mediator = new Mediator();

    @Override
    public void start(Stage primaryStage) {
        for (String username : usernames) {
            createClientWindow(username);
        }
    }

    private void createClientWindow(String username) {
        Controller controller = new Controller(username, mediator);

        Stage stage = new Stage();
        stage.setTitle("Mediator Chat " + username);
        stage.setWidth(400);
        stage.setHeight(600);

        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        TextField textField = new TextField();
        textField.setPromptText("Enter message");

        TextField textField2 = new TextField();
        textField2.setPromptText("Enter recipient");

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> {
            String message = textField.getText();
            String receiver = textField2.getText();
            controller.sendMessage(receiver, message);
            textField.clear();
        });

        HBox inputBox = new HBox(10, textField2, textField, sendButton);
        inputBox.setPadding(new Insets(10));

        VBox root = new VBox(10, textArea, inputBox);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 400, 600);
        stage.setScene(scene);
        stage.show();

        ClientGui clientGui = new ClientGui(textArea);
        controller.setGui(clientGui);

        mediator.addClient(username, controller);
    }
}
