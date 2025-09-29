package flyweight.tiles;

import flyweight.Tile;

public class SwampTile extends Tile {
    public SwampTile() {
        this.character = 'S';
        this.type = "swamp";
    }

    @Override
    public String action() {
        return null;
    }
}
