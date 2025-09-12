import java.util.ArrayList;

class P3Driver {
    public static void main(String[] args) {
        ArrayList<Ship> shipList = new ArrayList<>(3);

        Ship ship1 = new Ship("HMS Endeavour", 1764);
        Ship ship2 = new CruiseShip("Symphony of the Seas", 2018, 3000);
        Ship ship3 = new CargoShip("USS Everest", 2020, 12940);

        shipList.set(0, ship1);
        shipList.set(1, ship2);
        shipList.set(2, ship3);
        
        for (Ship s : shipList) {
            s.print();
        }    
    }
}