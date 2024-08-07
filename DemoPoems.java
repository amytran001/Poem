// DemoPoems.java
import java.util.Scanner;

public class DemoPoems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Poem poem = null;

        // Prompt the user for the type of poem
        int choice = 0;
        while (choice < 1 || choice > 4) {
            System.out.println("Enter the type of poem to create:");
            System.out.println("1 - Regular Poem");
            System.out.println("2 - Couplet");
            System.out.println("3 - Limerick");
            System.out.println("4 - Haiku");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        }

        // Prompt for the title
        System.out.println("Enter the title of the poem:");
        String title = scanner.nextLine();

        // Create the appropriate Poem object based on user choice
        switch (choice) {
            case 1:
                // Prompt for the number of lines if it's a regular Poem
                System.out.println("Enter the number of lines in the poem:");
                int lines = scanner.nextInt();
                poem = new Poem(title, lines);
                break;
            case 2:
                poem = new Couplet(title);
                break;
            case 3:
                poem = new Limerick(title);
                break;
            case 4:
                poem = new Haiku(title);
                break;
        }

        // Display the details of the poem
        System.out.println("\nPoem Details:");
        System.out.println("Title: " + poem.getTitle());
        System.out.println("Number of Lines: " + poem.getNumberOfLines());

        scanner.close();
    }
}
