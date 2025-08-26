package abstract_factory;

public class ButtonB extends Button {
    public ButtonB(String text) {
        super(text);
    }

    @Override
    public String display() {
        return ".==================.\n" +
                "||    [ START ]   ||\n" +
                "'=================='\n";
    }
}