package example.refactoring.conditional_logic;

class ShippingCostCalculator {
    public static ShippingCostCalculator of(double weight) {
        if (weight > 20) {
            return new HeavyWeightShippingCostCalculator(weight);
        } else if (weight > 10) {
            return new MediumWeightShippingCostCalculator(weight);
        } else {
            return new LigthWeightShippingCostCalculator(weight);
        }
    }

    private double weight;

    protected ShippingCostCalculator(double weight) {this.weight = weight;}

    public double invoke() {
        return weight * getRate() + getAdjustment();
    }

    private double getAdjustment() {
        if (weight > 20) {
            return 10;
        } else if (weight > 10) {
            return 0;
        } else {
            return 0;
        }
    }

    private double getRate() {
        if (weight > 20) {
            return 1.5;
        } else if (weight > 10) {
            return 1.2;
        } else {
            return 1.0;
        }
    }
}
