public class Rogue {

    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();
        creator.setFactory(new RogueFactory());
        Character rogue = creator.createCharacter("Rogue Jake");

    }
}
