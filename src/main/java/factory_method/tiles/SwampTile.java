package factory_method.tiles;

import factory_method.Tile;

public class SwampTile extends Tile {
    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public String getType() {
        return "Swamp";
    }

    @Override
    public void action() {
    }
}
