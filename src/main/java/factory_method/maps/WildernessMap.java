package factory_method.maps;

import factory_method.Map;
import factory_method.Tile;
import factory_method.tiles.ForestTile;
import factory_method.tiles.SwampTile;
import factory_method.tiles.WaterTile;


public class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            default: return new ForestTile();
        }
    }
}
