package composite;

public class Employee extends Organization {
    private int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void printData() {
        System.out.println("Employee: " + this.name + ", Salary: " + this.salary);
    }

    @Override
    public void add(Organization organization) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(Organization organization) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public Organization getChild(int index) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public String toXML(int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        return String.format("%s<Employee name=\"%s\" salary=\"%d\"/>\n", indent, name, salary);
    }

    @Override
    public int getTotalSalary() {
        return this.salary;
    }
}