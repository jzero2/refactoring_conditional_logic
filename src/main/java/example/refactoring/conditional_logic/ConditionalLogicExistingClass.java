package example.refactoring.conditional_logic;

public class ConditionalLogicExistingClass {

    public double calculateCost(Order order) {
        if (order.getWeight() > 20) {
            return order.getWeight() * 1.5 + 10;
        } else if (order.getWeight() > 10) {
            return order.getWeight() * 1.2;
        } else {
            return order.getWeight() * 1.0;
        }
    }

}