package builder;

public class OfficeComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void addProcessor() {
        computer.addPart(new Component("Intel i5"));
    }

    @Override
    public void addRAM() {
        computer.addPart(new Component("16GB"));
    }

    @Override
    public void addHardDrive() {
        computer.addPart(new Component("512GB SSD"));
    }

    @Override
    public void addGraphicsCard() {
        computer.addPart(new Component("Integrated Graphics"));
    }

    @Override
    public void addOperatingSystem() {
        computer.addPart(new Component("Windows 11 Pro"));
    }

    public Computer getComputer() {
        return computer;
    }
}
