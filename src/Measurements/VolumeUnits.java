package Measurements;

public enum VolumeUnits {
    GALLON(1),
    LITER(3.78);

    private double unit;

    VolumeUnits(double unit) {
        this.unit = unit;
    }

    public double convertToBase(double value) {
        return unit/value;
    }
}
