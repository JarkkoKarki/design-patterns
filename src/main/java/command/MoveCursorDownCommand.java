package command;

public class MoveCursorDownCommand implements Command {
    private final EditorModel model;
    public MoveCursorDownCommand(EditorModel model) { this.model = model; }
    public void execute() { model.moveDown(); }
}
