package Builder;

public class Computer {

    private String processor;
    private String operatingSystem;
    private String graphicsCard;
    private int ram;
    private String hardDrive;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Processor: " + processor +
                "\nRAM: " + ram + " GB" +
                "\nHard Drive: " + hardDrive +
                "\nGraphics Card: " + graphicsCard +
                "\nOperating System: " + operatingSystem;
    }
}
