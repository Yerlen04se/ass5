public class TraditionalMetalFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Traditional Metal Chair", "Traditional", "Metal", 120.0f);
    }

    @Override
    public Table createTable() {
        return new Table("Traditional Metal Table", "Traditional", "Metal", 250.0f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Traditional Metal Sofa", "Traditional", "Metal", 450.0f);
    }
}