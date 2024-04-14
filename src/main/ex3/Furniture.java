public class Furniture {
    private String name;
    private String style;
    private String material;
    private float price;

    public Furniture(String name, String style, String material, float price) {
        this.name = name;
        this.style = style;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - Style: " + style + ", Material: " + material + ", Price: $" + price;
    }
}
