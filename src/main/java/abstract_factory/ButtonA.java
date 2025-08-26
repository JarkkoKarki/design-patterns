package abstract_factory;

public class ButtonA extends Button {
    public ButtonA(String text) {
        super(text);
    }

    @Override
    public String display() {
        return  (
                "+------------------+\n" +
                "|     [ CLICK ]    |\n" +
                "+------------------+\n");
    }
}