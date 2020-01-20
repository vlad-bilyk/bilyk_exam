package food;

public class Dish extends Food {

    public int getWeight() {
        return weight;
    }

    private int weight;

    public Dish(String name, int weight) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name=" + getName() + ", weight=" + getWeight() +
                '}';
    }
}
