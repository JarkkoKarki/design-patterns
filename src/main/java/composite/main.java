package composite;

public class main {
    public static void main(String[] args) {
        Organization headOffice = new Department("Head Office");
        Organization salesDept = new Department("Sales Department");
        headOffice.add(salesDept);
        headOffice.add(new Employee("Charlie", 80000));
        Department itDept = new Department("IT Department");
        itDept.add(new Employee("Alice", 90000));
        itDept.add(new Employee("Bob", 85000));
        salesDept.add(itDept);

        headOffice.printData();

        System.out.println("\nXML Representation:\n");
        System.out.println(headOffice.toXML(0));

        System.out.println("\nTotal Salary: " + headOffice.getTotalSalary());
        System.out.println("Total Salary in Sales Department: " + salesDept.getTotalSalary());
    }
}