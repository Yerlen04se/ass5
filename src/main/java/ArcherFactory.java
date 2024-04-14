public class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        // Create an archer character with specific abilities, attributes, and equipment
        Character archer = new Character(name, "Archer Appearance");

        // Set archer's abilities
        archer.addAbility("Shoot Arrow");
        archer.addAbility("Stealth");

        // Set archer's attributes
        archer.setAttribute("Agility", 12);
        archer.setAttribute("Accuracy", 10);

        // Set archer's equipment
        archer.addEquipment("Bow");
        archer.addEquipment("Arrow Quiver");

        return archer;
    }
}
