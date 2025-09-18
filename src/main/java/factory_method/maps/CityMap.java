package factory_method.maps;

import factory_method.Map;
import factory_method.Tile;
import factory_method.tiles.BuildingTile;
import factory_method.tiles.ForestTile;
import factory_method.tiles.RoadTile;

public class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0: return new RoadTile();
            case 1: return new ForestTile();
            default: return new BuildingTile();
        }
    }
}
