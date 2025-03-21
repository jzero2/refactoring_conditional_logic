package example.refactoring.conditional_logic;

public class ConditionalLogicExistingClass {

    public double calculateCost(double weight) {
        return new ShippingCostCalculator(weight).invoke();
    }

}