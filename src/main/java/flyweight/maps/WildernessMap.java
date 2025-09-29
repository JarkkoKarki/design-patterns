package flyweight.maps;

import flyweight.Map;
import flyweight.Tile;
import flyweight.tiles.ForestTile;
import flyweight.tiles.SwampTile;
import flyweight.tiles.WaterTile;

public class WildernessMap extends Map {

    public WildernessMap() {
        super();
    }

    @Override
    protected Tile createTile() {
        int tileType = random.nextInt(3);

        if (tileType == 0) {
            return new SwampTile();
        } else if (tileType == 1) {
            return new WaterTile();
        } else {
            return new ForestTile();
        }
    }
}
