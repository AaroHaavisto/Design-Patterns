package Builder;

public class Main {

    public static void main(String[] args) {

        ComputerDirector director = new ComputerDirector();

        ComputerBuilder gamingBuilder = new GamingComputerBuilder();

        Computer gamingComputer = director.constructComputer(gamingBuilder);

        ComputerBuilder officeBuilder = new OfficeComputerBuilder();

        Computer officeComputer = director.constructComputer(officeBuilder);

        System.out.println("=== Gaming Computer ===");
        System.out.println(gamingComputer);

        System.out.println("\n=== Office Computer ===");
        System.out.println(officeComputer);
    }
}