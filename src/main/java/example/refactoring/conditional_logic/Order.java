package example.refactoring.conditional_logic;

class Order {
    private double weight;

    public Order(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}