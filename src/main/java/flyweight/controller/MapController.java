package flyweight.controller;

import flyweight.View.View;
import flyweight.Map;
import flyweight.maps.CityMap;
import flyweight.maps.WildernessMap;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;



public class MapController {
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private BorderPane borderPane;
    @FXML
    private TextArea mapDisplay;

    @FXML
    private Canvas mapCanvas;


    @FXML
    private void generateCityMap() {
        Map cityMap = new CityMap();
        mapDisplay.setText(cityMap.getMapAsString());
        // Render the map to the canvas
        cityMap.render(mapCanvas.getGraphicsContext2D(), 40);
    }

    @FXML
    private void generateWildernessMap() {
        Map wildernessMap = new WildernessMap();
        mapDisplay.setText(wildernessMap.getMapAsString());
        // Render the map to the canvas
        wildernessMap.render(mapCanvas.getGraphicsContext2D(), 40);
    }

    public static void main(String[] args) {
        View.launch(View.class);
    }
}