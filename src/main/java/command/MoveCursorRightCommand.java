package command;

public class MoveCursorRightCommand implements Command {
    private final EditorModel model;
    public MoveCursorRightCommand(EditorModel model) { this.model = model; }
    public void execute() { model.moveRight(); }
}
