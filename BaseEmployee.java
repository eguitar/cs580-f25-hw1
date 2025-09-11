class BaseEmployee extends Employee {
    private int baseSal;

    public BaseEmployee(String firstName, String lastName, int socialNum, int baseSal) {
        super(firstName, lastName, socialNum);
        this.baseSal = baseSal;
    }

    public int getBaseSal() { return baseSal; }
    public void setBaseSal(int baseSal) { this.baseSal = baseSal; }

    public String print() { return this.getFirstName()+", "+this.getLastName()+", "+this.getSocialNum()+", $"+baseSal; }
}