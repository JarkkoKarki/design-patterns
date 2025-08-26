package abstract_factory;

public abstract class Checkbox {
    protected String text;

    public Checkbox(String text) {
        this.text = text;
    }

    public abstract String display();

    public void setText(String text) {
        this.text = text;
    }
}