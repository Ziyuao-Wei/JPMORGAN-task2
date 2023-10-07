public class RewardValue {
    private double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public RewardValue(int miles) {
        this.cashValue = convertToCash(miles);
    }

    public double convertToCash(int miles) {
        return miles * CONVERSION_RATE;
    }

    public int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
