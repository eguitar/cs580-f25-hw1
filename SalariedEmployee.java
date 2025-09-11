public class SalariedEmployee extends Employee {
    private double weekSal;

    public SalariedEmployee(String firstName, String lastName, int socialNum, double weekSal) {
        super(firstName, lastName, socialNum);
        this.weekSal = weekSal;
    }

    public double getWeekSal() { return weekSal; }
    public void setWeekSal(double weekSal) { this.weekSal = weekSal; }
}