public class CruiseShip extends Ship {
    private int maxNumPasseng;

    public CruiseShip(String name, int year, int passeng) {
        super(name, year);
        this.maxNumPasseng = passeng;
    }

    public int getmaxNumPasseng() { return maxNumPasseng; }
    public void setmaxNumPasseng(int maxNumPasseng) { this.maxNumPasseng = maxNumPasseng; }

    @Override
    public void print() { System.out.println("Ship Name: " + getName() + "     Passenger Capacity: " + maxNumPasseng); }
}