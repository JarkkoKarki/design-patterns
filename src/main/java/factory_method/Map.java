package factory_method;

public abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] grid;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new Tile[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] = createTile();
            }
        }

    }

    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(grid[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }

    public abstract Tile createTile();
}
