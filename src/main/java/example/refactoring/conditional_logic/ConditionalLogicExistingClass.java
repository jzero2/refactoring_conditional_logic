package example.refactoring.conditional_logic;

public class ConditionalLogicExistingClass {

    public double calculateCost(double weight) {
        return ShippingCostCalculator.of(weight).invoke();
    }

}