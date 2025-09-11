import java.util.ArrayList;

class P2Driver {
    public static void main(String[] args) {
        ArrayList<Payable> payableList = new ArrayList<>();

        Payable p1 = new Freelancer("Joe", "Jones", 26.50, 35);
        Payable p2 = new VendorInvoice("Stephanie Smith", 1346175, 1000);
        Payable p3 = new Freelancer("Mary", "Quinn", 17.75, 48);
        Payable p4 = new VendorInvoice("Nicole Dior", 1346170, 975);

        payableList.add(p1);
        payableList.add(p2);
        payableList.add(p3);
        payableList.add(p4);
        
        for (Payable p : payableList) {
            p.print();
        }
    }
}