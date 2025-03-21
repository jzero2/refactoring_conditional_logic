package example.refactoring.conditional_logic;

public class LigthWeightShippingCostCalculator extends ShippingCostCalculator {
    public LigthWeightShippingCostCalculator(double weight) {super(weight);}

    @Override
    protected double getAdjustment() {
        if (weight > 20) {
            return 10;
        } else if (weight > 10) {
            return 0;
        } else {
            return 0;
        }
    }

    @Override
    protected double getRate() {
        if (weight > 20) {
            return 1.5;
        } else if (weight > 10) {
            return 1.2;
        } else {
            return 1.0;
        }
    }
}
