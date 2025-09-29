package flyweight;

public abstract class Tile {
    protected char character;
    protected String type;

    public char getCharacter() {
        return character;
    }

    public String getType() {
        return type;
    }

    public abstract String action();
}
