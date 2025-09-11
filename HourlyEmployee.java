public class HourlyEmployee extends Employee {
    private int wage;
    private int hrWork;

    public HourlyEmployee(String firstName, String lastName, int socialNum, int wage, int hrWork) {
        super(firstName, lastName, socialNum);
        this.wage = wage;
        this.hrWork = hrWork;
    }

    public int getWage() { return wage; }
    public void setWage(int wage) { this.wage = wage; }

    public int getHrWork() { return hrWork; }
    public void setHrWork(int hrWork) { this.hrWork = hrWork; }

    public String print() { return this.getFirstName()+", "+this.getLastName()+", "+this.getSocialNum()+", $"+wage+", "+hrWork; }
}