public class HourlyEmployee extends Employee {
    private double wage;
    private double hrWork;

    public HourlyEmployee(String firstName, String lastName, int socialNum, double wage, double hrWork) {
        super(firstName, lastName, socialNum);
        this.wage = wage;
        this.hrWork = hrWork;
    }

    public double getWage() { return wage; }
    public void setWage(double wage) { this.wage = wage; }

    public double getHrWork() { return hrWork; }
    public void setHrWork(double hrWork) { this.hrWork = hrWork; }
}