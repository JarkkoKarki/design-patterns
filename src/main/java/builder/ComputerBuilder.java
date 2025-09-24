package builder;

public interface ComputerBuilder {
    void addProcessor();
    void addRAM();
    void addHardDrive();
    void addGraphicsCard();
    void addOperatingSystem();
    Computer getComputer();
}
