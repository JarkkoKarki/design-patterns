package command;

public class TogglePixelCommand implements Command {
    private final EditorModel model;
    public TogglePixelCommand(EditorModel model) { this.model = model; }
    public void execute() { model.togglePixel(); }
}
