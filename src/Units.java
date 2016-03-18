public enum Units {
    mm("100"),
    cm("1"),
    m("0.01");

    private String unit;

    Units(String unit) {

        this.unit = unit;
    }

    public double getValue() {
        return Integer.parseInt(this.unit);

    }
}
