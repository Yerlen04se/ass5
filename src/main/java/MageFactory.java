public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        // Create a mage character with specific abilities, attributes, and equipment
        Character mage = new Character(name, "Mage Appearance");

        // Set mage's abilities
        mage.addAbility("Fireball");
        mage.addAbility("Teleport");

        // Set mage's attributes
        mage.setAttribute("Intelligence", 12);
        mage.setAttribute("Mana", 100);

        // Set mage's equipment
        mage.addEquipment("Staff");
        mage.addEquipment("Robe");

        return mage;
    }
}
