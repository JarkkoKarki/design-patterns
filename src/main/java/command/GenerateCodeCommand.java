package command;

public class GenerateCodeCommand implements Command {
    private final EditorModel model;
    public GenerateCodeCommand(EditorModel model) { this.model = model; }
    public void execute() { System.out.println(model.generateCode()); }
}
