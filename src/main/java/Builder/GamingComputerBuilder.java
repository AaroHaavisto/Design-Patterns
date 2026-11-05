package Builder;

public class GamingComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("AMD Ryzen 7 7700X");
    }

    @Override
    public void buildRAM() {
        computer.setRam(32);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("4TB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("RX 7800 XT");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
