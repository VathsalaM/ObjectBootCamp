package Measurements;

public enum Units{
    FEET(1),
    INCH(12),
    CM(30),
    MM(300);

    private int unit;

    Units(int unit) {
        this.unit = unit;
    }

    public double convertTo(double value) {
        return unit/value;
    }
}
