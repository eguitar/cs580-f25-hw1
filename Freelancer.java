public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourRate;
    private double hours;

    public Freelancer(String firstName, String lastName, double hourRate, double hours) {
        if (hours < 0 || hourRate < 0) {
            throw new IllegalArgumentException("Invalid hours or hourly rate");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourRate = hourRate;
        this.hours = hours;
    }

    @Override
    public String getPayeeName() { return firstName + " " + lastName; }

    public void setPayeeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getHourRate() { return hourRate; }
    public void setHourRate(double hourRate) { this.hourRate = hourRate; }

    public double getHours() { return hours; }
    public void setHours(double hours) { this.hours = hours; }

    @Override
    public double calculatePayment() {
        if (hours <= 40) { return hours * hourRate; }
        else { return (40 * hourRate) + (1.5 * hourRate * (hours - 40)); }
    }

    @Override
    public void print() {
        System.out.printf("Name: %s     Payment Amount: %.2f%n",
                getPayeeName(), calculatePayment());
    }
}
