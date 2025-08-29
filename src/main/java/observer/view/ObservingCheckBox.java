package observer.view;

import javafx.application.Platform;
import javafx.scene.control.CheckBox;

public class ObservingCheckBox extends CheckBox implements Observer {

    private final String name;

    public ObservingCheckBox(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        if (this.isSelected()) {
            Platform.runLater(() -> {
                this.setText(name + " - Temp: " + temperature + "°C");
            });
        }
    }

}