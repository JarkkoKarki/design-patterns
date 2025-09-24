package builder;

public class GamingComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void addProcessor() {
        computer.addPart(new Component("Intel core i9") );
    }

    @Override
    public void addRAM() {
        computer.addPart(new Component("32GB DDR5 RAM") );

    }

    @Override
    public void addHardDrive() {
        computer.addPart(new Component("1TB NVMe SSD") );

    }

    @Override
    public void addGraphicsCard() {
        computer.addPart(new Component("NVIDIA GeForce RTX 4090") );

    }

    @Override
    public void addOperatingSystem() {
        computer.addPart(new Component("Windows 11 Pro") );

    }

    public Computer getComputer() {
        return computer;
    }
}
