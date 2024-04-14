public class IndustrialGlassFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Industrial Glass Chair", "Industrial", "Glass", 180.0f);
    }

    @Override
    public Table createTable() {
        return new Table("Industrial Glass Table", "Industrial", "Glass", 350.0f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Industrial Glass Sofa", "Industrial", "Glass", 600.0f);
    }
}