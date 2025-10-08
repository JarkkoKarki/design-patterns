package command;

public class MoveCursorLeftCommand implements Command {
    private final EditorModel model;
    public MoveCursorLeftCommand(EditorModel model) { this.model = model; }
    public void execute() { model.moveLeft(); }
}
