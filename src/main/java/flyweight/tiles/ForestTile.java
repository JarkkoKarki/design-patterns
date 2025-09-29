package flyweight.tiles;

import flyweight.Tile;

public class ForestTile extends Tile {
    public ForestTile() {
        this.character = 'F';
        this.type = "forest";
    }

    @Override
    public String action() {
        return null;
    }
}
