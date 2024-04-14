import java.util.Scanner;

public class FurnitureSystem {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display available styles and materials
        System.out.println("Available Styles: Modern, Traditional, Industrial");
        System.out.println("Available Materials: Wood, Metal, Glass");

        // Prompt the user to select a style
        System.out.print("Enter the style (Modern/Traditional/Industrial): ");
        String style = scanner.nextLine();

        // Prompt the user to select a material
        System.out.print("Enter the material (Wood/Metal/Glass): ");
        String material = scanner.nextLine();

        // Create a FurnitureCreator
        FurnitureCreator creator = new FurnitureCreator();

        // Create furniture products based on user-selected style and material
        FurnitureFactory factory = null;
        if (style.equalsIgnoreCase("Modern")) {
            if (material.equalsIgnoreCase("Wood")) {
                factory = new ModernWoodFactory();
            } else if (material.equalsIgnoreCase("Metal")) {
                factory = new TraditionalMetalFactory();
            } else if (material.equalsIgnoreCase("Glass")) {
                factory = new IndustrialGlassFactory();
            } else {
                System.out.println("Invalid material selection.");
                return;
            }
        } else if (style.equalsIgnoreCase("Traditional")) {
            // Implement factories for Traditional style
            // Handle the cases for different materials
        } else if (style.equalsIgnoreCase("Industrial")) {
            // Implement factories for Industrial style
            // Handle the cases for different materials
        } else {
            System.out.println("Invalid style selection.");
            return;
        }

        // Set the factory and create furniture products
        creator.setFactory(factory);
        Chair chair = creator.createChair();
        Table table = creator.createTable();
        Sofa sofa = creator.createSofa();

        // Display the furniture products to the user
        System.out.println("Selected Furniture:");
        System.out.println(chair);
        System.out.println(table);
        System.out.println(sofa);

        // Close the scanner
        scanner.close();
    }
}
