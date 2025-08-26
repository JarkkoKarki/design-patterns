package abstract_factory;

public abstract class TextField {
    protected String text;

    public TextField(String text) {
        this.text = text;
    }

    public abstract String display();

    public void setText(String text) {
        this.text = text;
    }
}