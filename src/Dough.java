public class Dough {
    private String type;
    private String texture;
    private double weight;

    public Dough(String type, String texture, double weight) {
        this.type = type;
        this.texture = texture;
        this.weight = weight;
    }

    public Dough(String type, String texture) {
        this(type, texture, 0);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printDough() {
        System.out.println("Type: " + type + ", Texture: " + texture + ", Weight: " + weight + "g");
    }
}