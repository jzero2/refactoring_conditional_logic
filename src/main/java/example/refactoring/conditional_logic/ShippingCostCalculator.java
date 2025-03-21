package example.refactoring.conditional_logic;

class ShippingCostCalculator {
    private double weight;

    public ShippingCostCalculator(double weight) {this.weight = weight;}

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
