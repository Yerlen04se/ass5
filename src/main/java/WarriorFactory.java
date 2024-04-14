public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        // Create a warrior character with specific abilities, attributes, and equipment
        Character warrior = new Character(name, "Warrior Appearance");

        // Set warrior's abilities
        warrior.addAbility("Slash");
        warrior.addAbility("Block");

        // Set warrior's attributes
        warrior.setAttribute("Strength", 10);
        warrior.setAttribute("Defense", 8);

        // Set warrior's equipment
        warrior.addEquipment("Sword");
        warrior.addEquipment("Shield");

        return warrior;
    }

}
