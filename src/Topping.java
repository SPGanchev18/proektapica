public class Topping {
    private String type;
    private double weight;

    public Topping(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public Topping(String type) {
        this(type, 0);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printTopping() {
        System.out.println("Type: " + type + ", Weight: " + weight + "g");
    }
}