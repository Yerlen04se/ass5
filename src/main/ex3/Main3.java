public class Main3 {
    public static void main(String[] args) {
        // Create a FurnitureCreator
        FurnitureCreator creator = new FurnitureCreator();

        // Create furniture products using different concrete factories
        FurnitureFactory modernWoodFactory = new ModernWoodFactory();
        creator.setFactory(modernWoodFactory);
        Chair modernWoodChair = creator.createChair();
        Table modernWoodTable = creator.createTable();
        Sofa modernWoodSofa = creator.createSofa();

        FurnitureFactory traditionalMetalFactory = new TraditionalMetalFactory();
        creator.setFactory(traditionalMetalFactory);
        Chair traditionalMetalChair = creator.createChair();
        Table traditionalMetalTable = creator.createTable();
        Sofa traditionalMetalSofa = creator.createSofa();

        FurnitureFactory industrialGlassFactory = new IndustrialGlassFactory();
        creator.setFactory(industrialGlassFactory);
        Chair industrialGlassChair = creator.createChair();
        Table industrialGlassTable = creator.createTable();
        Sofa industrialGlassSofa = creator.createSofa();

        // Display the created furniture products
        System.out.println("Modern Wood Chair: " + modernWoodChair);
        System.out.println("Modern Wood Table: " + modernWoodTable);
        System.out.println("Modern Wood Sofa: " + modernWoodSofa);

        System.out.println("Traditional Metal Chair: " + traditionalMetalChair);
        System.out.println("Traditional Metal Table: " + traditionalMetalTable);
        System.out.println("Traditional Metal Sofa: " + traditionalMetalSofa);

        System.out.println("Industrial Glass Chair: " + industrialGlassChair);
        System.out.println("Industrial Glass Table: " + industrialGlassTable);
        System.out.println("Industrial Glass Sofa: " + industrialGlassSofa);
    }
}
