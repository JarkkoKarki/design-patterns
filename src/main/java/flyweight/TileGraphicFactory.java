package flyweight;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.SnapshotParameters;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static TileGraphicFactory instance = new TileGraphicFactory();
    private Map<String, Image> cache = new HashMap<>();

    public static TileGraphicFactory getInstance() {
        return instance;
    }

    public Image getGraphicForType(String type, int size) {
        String key = type + "_" + size;
        // Jos ei ole luodaan uusi
        if (!cache.containsKey(key)) {
            cache.put(key, createGraphic(type, size));
        }
        return cache.get(key);
    }

    private Image createGraphic(String type, int size) {
        Canvas canvas = new Canvas(size, size);
        var gc = canvas.getGraphicsContext2D();

        // Värit
        switch (type.toLowerCase()) {
            case "swamp": gc.setFill(Color.DARKGREEN); break;
            case "water": gc.setFill(Color.BLUE); break;
            case "road": gc.setFill(Color.GRAY); break;
            case "forest": gc.setFill(Color.FORESTGREEN); break;
            case "building": gc.setFill(Color.BROWN); break;
            default: gc.setFill(Color.BLACK); break;
        }
        gc.fillRect(0, 0, size, size);

        // Otetaan screenshot canvaksesta jotta saadaan image.
        SnapshotParameters params = new SnapshotParameters();
        return canvas.snapshot(params, null);
    }
}
