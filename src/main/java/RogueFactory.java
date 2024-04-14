public class RogueFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        // Create a rogue character with specific abilities, attributes, and equipment
        Character rogue = new Character(name, "Rogue Appearance");

        // Set rogue's abilities
        rogue.addAbility("Backstab");
        rogue.addAbility("Stealth");

        // Set rogue's attributes
        rogue.setAttribute("Agility", 10);
        rogue.setAttribute("Critical Chance", 15);

        // Set rogue's equipment
        rogue.addEquipment("Dagger");
        rogue.addEquipment("Thieves' Garb");

        return rogue;
    }
}
