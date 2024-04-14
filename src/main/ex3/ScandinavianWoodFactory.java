public class ScandinavianWoodFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Scandinavian Wood Chair", "Scandinavian", "Wood", 200.0f);
    }

    @Override
    public Table createTable() {
        return new Table("Scandinavian Wood Table", "Scandinavian", "Wood", 400.0f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Scandinavian Wood Sofa", "Scandinavian", "Wood", 700.0f);
    }
}