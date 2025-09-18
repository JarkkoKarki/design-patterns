package factory_method.tiles;

import factory_method.Tile;

public class WaterTile extends Tile {
    @Override
    public String getCharacter() {
        return "W";
    }

    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public void action() {
    }
}
