package command;

public class MoveCursorUpCommand implements Command {
    private final EditorModel model;
    public MoveCursorUpCommand(EditorModel model) { this.model = model; }
    public void execute() { model.moveUp(); }
}
