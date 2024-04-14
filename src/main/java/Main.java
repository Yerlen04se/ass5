public class Main {
    public static void main(String[] args) {
        // Create a character creator
        CharacterCreator creator = new CharacterCreator();

        // Set concrete factories for different character classes
        creator.setFactory(new WarriorFactory());
        Character warrior = creator.createCharacter("Warrior Bob");

        creator.setFactory(new MageFactory());
        Character mage = creator.createCharacter("Mage Alice");

        creator.setFactory(new ArcherFactory());
        Character archer = creator.createCharacter("Archer John");

        creator.setFactory(new RogueFactory());
        Character rogue = creator.createCharacter("Rogue Jake");

        // Print information about the created characters
        printCharacterInfo(warrior);
        printCharacterInfo(mage);
        printCharacterInfo(archer);
        printCharacterInfo(rogue);
    }

    private static void printCharacterInfo(Character character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Appearance: " + character.getAppearance());
        System.out.println("Abilities: " + character.getAbilities());
        System.out.println("Equipment: " + character.getEquipment());
        System.out.println("Attributes: " + character.getAttributes());
        System.out.println();
    }
}
