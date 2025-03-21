package example.refactoring.conditional_logic;

public class MediumWeightShippingCostCalculator extends ShippingCostCalculator {
    public MediumWeightShippingCostCalculator(double weight) {super(weight);}

    @Override
    protected double getAdjustment() {
        return 0;
    }

    @Override
    protected double getRate() {
        return 1.2;
    }
}
