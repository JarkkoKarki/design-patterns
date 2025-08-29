package observer;

import javafx.application.Application;
import observer.model.WeatherStation;
import observer.view.Gui;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Thread t = new Thread(station);
        t.start();

        // Sääasema Gui-luokkaan
        Gui.setWeatherStation(station);

        Application.launch(Gui.class);
    }
}
