package Visitor;

public class Main {
    public static void main(String[] args) {
        Directory documents = new Directory("Documents");
        Directory projects = new Directory("Projects");

        File report = new File("report.pdf", 5);
        File notes = new File("notes.txt", 2);
        File main = new File("Main.java", 1);
        File app = new File("App.java", 3);

        documents.addElement(report);
        documents.addElement(notes);

        projects.addElement(main);
        projects.addElement(app);

        documents.addElement(projects);

        SizeCalculatorVisitor sizeVisitor =
                new SizeCalculatorVisitor();

        documents.accept(sizeVisitor);

        System.out.println("Total size: "
                + sizeVisitor.getTotalSize() + " MB");

        SearchVisitor searchVisitor =
                new SearchVisitor(".java");

        documents.accept(searchVisitor);

        System.out.println("Java files found:");

        for (File file : searchVisitor.getFoundFiles()) {
            System.out.println(file.getName());
        }
    }
}