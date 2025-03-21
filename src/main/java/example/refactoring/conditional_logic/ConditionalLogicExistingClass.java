package example.refactoring.conditional_logic;

public class ConditionalLogicExistingClass {

    public double calculateCost(double weight) {
        return new ShippingCostCalculator(weight).invoke();
    }

    private class ShippingCostCalculator {
        private double weight;

        public ShippingCostCalculator(double weight) {this.weight = weight;}

        public double invoke() {
            if (weight > 20) {
                return weight * 1.5 + 10;
            } else if (weight > 10) {
                return weight * 1.2;
            } else {
                return weight * 1.0;
            }
        }
    }
}