//package Object;
///*
//        Add the values of other length and return length
//
//        Multiply the value with other length or number
//
//        check for the positivity of value
//
// */
//
//public class Measurements {
//
//    private final double value;
//    private final Unit unit;
//
//    public Measurements(double value, Unit unit) {
//        this.value = value;
//        this.unit = unit;
//    }
//
//    public Measurements multiply(Measurements other) {
//        return new Measurements(this.value*other.value,this.unit.multiply(other.unit));
//    }
//    public Measurements multiply(int other) {
//        return new Measurements(this.value*other,this.unit);
//    }
//
//    public Measurements add(Measurements other) {
//        return new Measurements(this.value+other.value,this.unit);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Measurements that = (Measurements) o;
//        return value == that.value && (unit != null ? unit.equals(that.unit) : that.unit == null);
//    }
//
//    public boolean isPositive() {
//        return value>0;
//    }
//
//    @Override
//    public String toString() {
//        return ""+value;
//    }
//}
