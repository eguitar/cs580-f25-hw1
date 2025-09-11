public class Ship {
    private String name;
    private int year;

    public Ship(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() { return name; }
    public void setName(String newName) { this.name = newName; }

    public int getYear() { return year; }
    public void setYear(int newYear) { this.year = newYear; }

    public void print() { System.out.println("Ship Name: " + name + "     Year Built: " + year); }
}