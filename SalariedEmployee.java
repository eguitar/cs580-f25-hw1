public class SalariedEmployee extends Employee {
    private int weekSal;

    public SalariedEmployee(String firstName, String lastName, int socialNum, int weekSal) {
        super(firstName, lastName, socialNum);
        this.weekSal = weekSal;
    }

    public int getWeekSal() { return weekSal; }
    public void setWeekSal(int weekSal) { this.weekSal = weekSal; }

    public String print() { return this.getFirstName()+", "+this.getLastName()+", "+this.getSocialNum()+", $"+weekSal; }
}