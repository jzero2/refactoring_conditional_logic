package example.refactoring.conditional_logic;

public class LigthWeightShippingCostCalculator extends ShippingCostCalculator {
    public LigthWeightShippingCostCalculator(double weight) {super(weight);}

    @Override
    protected double getAdjustment() {
        return 0;
    }

    @Override
    protected double getRate() {
        return 1.0;
    }
}
