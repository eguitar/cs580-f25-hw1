public class VendorInvoice implements Payable {
    private String vendorName;
    private int invoiceNum;
    private double amountDue;

    public VendorInvoice(String vendorName, int invoiceNum, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNum = invoiceNum;
        this.amountDue = amountDue;
    }

    @Override
    public String getPayeeName() { return vendorName; }
    public void setName(String newName) { this.vendorName = newName; }

    public int getInvoiceNum() { return invoiceNum; }
    public void setInvoiceNum(int newInvoiceNum) { this.invoiceNum = newInvoiceNum; }

    public void setAmountDue(double newAmountDue) { this.amountDue = newAmountDue; }

    @Override
    public double calculatePayment() { return amountDue; }

    @Override
    public void print() {
        System.out.printf("Name: %s     Invoice Number: %d     Payment Amount: %.2f%n",
                          getPayeeName(), invoiceNum, calculatePayment());
    }
}
