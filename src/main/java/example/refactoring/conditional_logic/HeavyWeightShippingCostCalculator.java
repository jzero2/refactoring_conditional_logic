package example.refactoring.conditional_logic;

public class HeavyWeightShippingCostCalculator extends ShippingCostCalculator {
    public HeavyWeightShippingCostCalculator(double weight) {super(weight);}

    @Override
    protected double getAdjustment() {
        return 10;
    }

    @Override
    protected double getRate() {
        return 1.5;
    }
}
