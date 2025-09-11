public class CommissionEmployee extends Employee {
    private int comRate;
    private int comSale;

    public CommissionEmployee(String firstName, String lastName, int socialNum, int comRate, int comSale) {
        super(firstName, lastName, socialNum);
        this.comRate = comRate;
        this.comSale = comSale;
    }

    public int getComRate() { return comRate; }
    public void setComRate(int comRate) { this.comRate = comRate; }

    public int getComSale() { return comSale; }
    public void setComSale(int comSale) { this.comSale = comSale; }

    public String print() { return this.getFirstName()+", "+this.getLastName()+", "+this.getSocialNum()+", %"+comRate+", $"+comSale; }
}