public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, int year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCap() { return cargoCapacity; }
    public void setCargoCap(int newCargoCap) { this.cargoCapacity = newCargoCap; }

    @Override
    public void print() { System.out.println("Ship Name: " + getName() + "     Cargo Capacity: " + cargoCapacity); }
}