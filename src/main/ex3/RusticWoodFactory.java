public class RusticWoodFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Rustic Wood Chair", "Rustic", "Wood", 180.0f);
    }

    @Override
    public Table createTable() {
        return new Table("Rustic Wood Table", "Rustic", "Wood", 350.0f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Rustic Wood Sofa", "Rustic", "Wood", 600.0f);
    }
}