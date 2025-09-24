package builder;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.addProcessor();
        builder.addRAM();
        builder.addHardDrive();
        builder.addGraphicsCard();
        builder.addOperatingSystem();
    }

}
