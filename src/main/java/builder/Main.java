package builder;


public class Main {
    public static void main(String[] args) {

        System.out.println("__________________________________________________________________________");
        System.out.println("Gaming Computer:");
        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.construct();
        Computer computer = builder.getComputer();
        System.out.println(computer);


        System.out.println("__________________________________________________________________________");
        System.out.println("Office Computer:");
        ComputerBuilder builder1 = new OfficeComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(builder1);
        director1.construct();
        Computer computer1 = builder1.getComputer();
        System.out.println(computer1);
    }
}
