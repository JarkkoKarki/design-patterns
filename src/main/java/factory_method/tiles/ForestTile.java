package factory_method.tiles;

import factory_method.Tile;

public class ForestTile extends Tile {
    @Override
    public String getCharacter() {
        return "F";
    }

    @Override
    public String getType() {
        return "Forest";
    }

    @Override
    public void action() {
    }
}
