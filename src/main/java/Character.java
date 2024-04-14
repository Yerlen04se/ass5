import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Character {
    private String name;
    private Object appearance;
    private List<Object> abilities;
    private List<Object> equipment;
    private Map<String, Object> attributes;

    public Character(String name, Object appearance) {
        this.name = name;
        this.appearance = appearance;
        this.abilities = new ArrayList<>();
        this.equipment = new ArrayList<>();
        this.attributes = new HashMap<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAppearance(Object appearance) {
        this.appearance = appearance;
    }

    public Object getAppearance() {
        return appearance;
    }

    public void addAbility(Object ability) {
        abilities.add(ability);
    }

    public void removeAbility(Object ability) {
        abilities.remove(ability);
    }

    public List<Object> getAbilities() {
        return abilities;
    }

    public void addEquipment(Object item) {
        equipment.add(item);
    }

    public void removeEquipment(Object item) {
        equipment.remove(item);
    }

    public List<Object> getEquipment() {
        return equipment;
    }

    public void setAttribute(String attributeName, Object value) {
        attributes.put(attributeName, value);
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }


}
