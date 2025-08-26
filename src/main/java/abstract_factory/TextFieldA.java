package abstract_factory;

public class TextFieldA extends TextField {
    public TextFieldA(String text) {
        super(text);
    }

    @Override
    public String display() {
        return "+------------------------+" + "\n" +
                "|  Enter text here...    |" + "\n" +
                "+------------------------+";

    }
}