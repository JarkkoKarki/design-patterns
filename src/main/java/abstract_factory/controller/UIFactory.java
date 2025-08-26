package abstract_factory.controller;

import abstract_factory.*;
import abstract_factory.view.main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public abstract class UIFactory {
    public abstract abstract_factory.Button createButton(String text);
    public abstract TextField createTextField(String text);
    public abstract Checkbox createCheckbox(String text);

    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private TextArea UIDisplay;

    @FXML
    private void initialize() {
        b1.setOnAction(event -> handleFactorySelection(true));
        b2.setOnAction(event -> handleFactorySelection(false));
    }

    private void handleFactorySelection(boolean isAFactory) {
        UIFactory factory = isAFactory ? new AFactory() : new BFactory();

        abstract_factory.Button button = factory.createButton("Button");
        TextField textField = factory.createTextField("TextField");
        Checkbox checkbox = factory.createCheckbox("heckbox");
        button.display();

        UIDisplay.setText(
                "Factory: " + (isAFactory ? "AFactory" : "BFactory") + "\n" +
                        button.display() + "\n" +
                        textField.display()+ "\n" +
                        checkbox.display()
        );
    }
    public static void main(String[] args) {
        main.launch(main.class);
    }
}