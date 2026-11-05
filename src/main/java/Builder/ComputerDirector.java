package Builder;

public class ComputerDirector {

    public Computer constructComputer(ComputerBuilder builder) {

        builder.buildProcessor();
        builder.buildGraphicsCard();
        builder.buildHardDrive();
        builder.buildOperatingSystem();
        builder.buildRAM();


        return builder.getComputer();
    }
}
