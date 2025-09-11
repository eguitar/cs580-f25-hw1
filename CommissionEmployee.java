public class CommissionEmployee extends Employee {
    private double comRate;
    private double comSale;

    public CommissionEmployee(String firstName, String lastName, int socialNum, double comRate, double comSale) {
        super(firstName, lastName, socialNum);
        this.comRate = comRate;
        this.comSale = comSale;
    }

    public double getComRate() { return comRate; }
    public void setComRate(double comRate) { this.comRate = comRate; }

    public double getComSale() { return comSale; }
    public void setComSale(double comSale) { this.comSale = comSale; }
}