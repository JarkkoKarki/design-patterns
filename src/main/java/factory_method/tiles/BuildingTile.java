package factory_method.tiles;

import factory_method.Tile;

public class BuildingTile extends Tile {
    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public String getType() {
        return "Building";
    }

    @Override
    public void action() {
    }
}
