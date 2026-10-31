package Proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User aaro = new User("aaro");
        User mikko = new User("mikko");

        library.addPublicDocument(
                "DOC-1", "This is a public document.");

        library.addProtectedDocument(
                "DOC-2", "This is a protected document.");

        AccessControlService service =
                AccessControlService.getInstance();

        service.grantAccess("DOC-2", "aaro");

        IDocument publicDocument =
                library.getDocument("DOC-1");

        IDocument protectedDocument =
                library.getDocument("DOC-2");

        System.out.println("Public document:");
        System.out.println(publicDocument.getContent(mikko));

        System.out.println();
        System.out.println("Protected document:");

        try {
            System.out.println(protectedDocument.getContent(aaro));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Unauthorized access:");

        try {
            System.out.println(protectedDocument.getContent(mikko));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Creation date:");
        System.out.println(protectedDocument.getCreationDate());
    }
}