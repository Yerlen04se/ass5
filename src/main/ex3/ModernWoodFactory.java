public class ModernWoodFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Modern Wood Chair", "Modern", "Wood", 150.0f);
    }

    @Override
    public Table createTable() {
        return new Table("Modern Wood Table", "Modern", "Wood", 300.0f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Modern Wood Sofa", "Modern", "Wood", 500.0f);
    }
}