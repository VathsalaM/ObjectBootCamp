public class Unit {
    private String unit;

    public Unit(String unit) {
        this.unit = unit;
    }

    public double getValue(){
        return Units.valueOf(unit).getValue();
    }

    public Unit multiply(Unit other) {
        return (unit.equals(other.unit))?new Unit(unit+"²"):new Unit(unit+other.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Unit unit1 = (Unit) o;

        return unit != null ? unit.equals(unit1.unit) : unit1.unit == null;

    }
}
