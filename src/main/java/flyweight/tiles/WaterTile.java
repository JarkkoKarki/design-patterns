package flyweight.tiles;

import flyweight.Tile;

public class WaterTile extends Tile {
    public WaterTile() {
        this.character = 'W';
        this.type = "water";
    }

    @Override
    public String action() {
        return null;
    }
}