package flyweight.maps;

import flyweight.Map;
import flyweight.Tile;
import flyweight.tiles.BuildingTile;
import flyweight.tiles.ForestTile;
import flyweight.tiles.RoadTile;

public class CityMap extends Map {

    public CityMap() {
        super();
    }

    @Override
    protected Tile createTile() {
        int tileType = random.nextInt(3);

        if (tileType == 0) {
            return new RoadTile();
        } else if (tileType == 1) {
            return new ForestTile();
        } else {
            return new BuildingTile();
        }
    }
}
