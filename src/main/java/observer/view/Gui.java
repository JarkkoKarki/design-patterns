package observer.view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import observer.model.WeatherStation;

public class Gui extends Application {

    private static WeatherStation weatherStation;


    @Override
    public void start(Stage primaryStage) {
        openWindow("Window 1");
        openWindow("Window 2");
        openWindow("Window 3");
    }

    private void openWindow(String windowName) {
        Stage stage = new Stage();
        stage.setTitle(windowName);

        // Luodaan ObservingCheckBox joka rekisteröidään havainnoijaksi
        ObservingCheckBox checkBox = new ObservingCheckBox(windowName);
        weatherStation.addObserver(checkBox);


        // Poistetaan havainnoija kun ikkuna suljetaan
        stage.setOnCloseRequest(event -> {
            weatherStation.removeObserver(checkBox);
        });

        VBox root = new VBox(10, checkBox);
        Scene scene = new Scene(root, 300, 100);

        stage.setScene(scene);
        stage.show();
    }


    // sääasema mainista
    public static void setWeatherStation(WeatherStation ws) {
        weatherStation = ws;
    }
}