package composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends Organization {
    private List<Organization> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(Organization organization) {
        this.children.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        this.children.remove(organization);
    }

    @Override
    public Organization getChild(int i) {
        return this.children.get(i);
    }

    @Override
    public void printData() {
        System.out.println("Department: " + this.name);
        for (Organization child : this.children) {
            child.printData();
        }
    }

    @Override
    public String toXML(int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s<Department name=\"%s\">\n", indent, name));
        for (Organization organization : children) {
            sb.append(organization.toXML(indentLevel + 1));
        }
        sb.append(String.format("%s</Department>\n", indent));
        return sb.toString();
    }

    @Override
    public int getTotalSalary() {
        int totalSalary = 0;
        for (Organization child : children) {
            totalSalary += child.getTotalSalary();
        }
        return totalSalary;
    }
}