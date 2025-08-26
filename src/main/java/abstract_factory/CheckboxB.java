package abstract_factory;

public class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public String display() {
        return ".---.\n" +
                "| x |\n" +
                "'---'\n";
    }
}