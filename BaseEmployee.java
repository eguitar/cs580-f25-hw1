class BaseEmployee extends Employee {
    private double baseSal;

    public BaseEmployee(String firstName, String lastName, int socialNum, double baseSal) {
        super(firstName, lastName, socialNum);
        this.baseSal = baseSal;
    }

    public double getBaseSal() { return baseSal; }
    public void setBaseSal(double baseSal) { this.baseSal = baseSal; }
}