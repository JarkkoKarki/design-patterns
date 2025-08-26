package abstract_factory;

public class TextFieldB extends TextField {
    public TextFieldB(String text) {
        super(text);
    }

    @Override
    public String display() {
        return ".========================." + "\n" +
                "||   Input goes here    ||" + "\n" +
                "'========================'";

    }
}