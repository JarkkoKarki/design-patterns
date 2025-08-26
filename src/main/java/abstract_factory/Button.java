package abstract_factory;

public abstract class Button {
    protected String text;

    public Button(String text) {
        this.text = text;
    }

    public abstract String display();

    public void setText(String text) {
        this.text = text;
    }
}