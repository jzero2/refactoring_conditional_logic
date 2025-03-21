package example.refactoring.conditional_logic;

abstract class ShippingCostCalculator {
    public static ShippingCostCalculator of(double weight) {
        if (weight > 20) {
            return new HeavyWeightShippingCostCalculator(weight);
        } else if (weight > 10) {
            return new MediumWeightShippingCostCalculator(weight);
        } else {
            return new LigthWeightShippingCostCalculator(weight);
        }
    }

    protected double weight;

    protected ShippingCostCalculator(double weight) {this.weight = weight;}

    public double invoke() {
        return weight * getRate() + getAdjustment();
    }

    protected abstract double getAdjustment();

    protected abstract double getRate();
}
