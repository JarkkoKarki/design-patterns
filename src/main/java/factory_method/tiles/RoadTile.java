package factory_method.tiles;

import factory_method.Tile;

public class RoadTile extends Tile {
    @Override
    public String getCharacter() {
        return "R";
    }

    @Override
    public String getType() {
        return "Road";
    }

    @Override
    public void action() {
    }
}
