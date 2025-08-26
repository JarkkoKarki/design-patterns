package composite;

public abstract class Organization {
    protected String name;

    public Organization(String name) {
        this.name = name;
    }

    public abstract void printData();

    public abstract void add(Organization org);

    public abstract void remove(Organization org);

    public abstract Organization getChild(int i);

    public abstract String toXML(int indentLevel);

    public abstract int getTotalSalary(); // New method to calculate total salary
}