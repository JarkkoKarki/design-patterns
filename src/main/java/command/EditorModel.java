package command;

public class EditorModel {
    private final boolean[][] grid;
    private int cursorRow = 0, cursorCol = 0;

    public EditorModel(int size) {
        grid = new boolean[size][size];
    }

    public boolean getPixel(int r, int c) { return grid[r][c]; }
    public int getCursorRow() { return cursorRow; }
    public int getCursorCol() { return cursorCol; }

    public void moveUp() { if (cursorRow > 0) cursorRow--; }
    public void moveDown() { if (cursorRow < grid.length - 1) cursorRow++; }
    public void moveLeft() { if (cursorCol > 0) cursorCol--; }
    public void moveRight() { if (cursorCol < grid.length - 1) cursorCol++; }
    public void togglePixel() { grid[cursorRow][cursorCol] = !grid[cursorRow][cursorCol]; }

    public String generateCode() {
        StringBuilder sb = new StringBuilder("int[][] pixelArt = {\n");
        for (int r = 0; r < grid.length; r++) {
            sb.append("    {");
            for (int c = 0; c < grid.length; c++) {
                sb.append(grid[r][c] ? 1 : 0);
                if (c < grid.length - 1) sb.append(", ");
            }
            sb.append("}");
            if (r < grid.length - 1) sb.append(",\n"); else sb.append("\n");
        }
        sb.append("};");
        return sb.toString();
    }
}
