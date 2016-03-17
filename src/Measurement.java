public class Measurement {

    private final int value;
    private final String unit;

    public Measurement(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public Measurement multiply(Measurement other) {
        return new Measurement(this.value*other.value,this.unit+"x"+other.unit);
    }
    public Measurement multiply(int other) {
        return new Measurement(this.value*other,this.unit);
    }

    public Measurement add(Measurement other) {
        return new Measurement(this.value+other.value,this.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        if (value != that.value) return false;
        return unit != null ? unit.equals(that.unit) : that.unit == null;

    }


}
