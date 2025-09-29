package flyweight.tiles;

import flyweight.Tile;

public class RoadTile extends Tile {
    public RoadTile() {
        this.character = 'R';
        this.type = "road";
    }

    @Override
    public String action() {
        return null;
    }
}
