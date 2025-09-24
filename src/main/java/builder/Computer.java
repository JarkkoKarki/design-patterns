package builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Component> parts;

    public Computer() {
        this.parts = new ArrayList<>();
    }

    public void addPart(Component part) {
        parts.add(part);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Component part : parts) {
            sb.append("- ").append(part.getName()).append("\n");
        }
        return sb.toString();
    }

}
