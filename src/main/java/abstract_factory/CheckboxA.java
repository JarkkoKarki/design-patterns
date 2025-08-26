package abstract_factory;

public class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public String display() {
        return "[ ]";

    }
}