public class Employee implements Payable{
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        invoices = new Invoice[0];
    }

    @Override
    public double getPayableAmount() {
        int sisaGaji = salaryPerMonth;
        for (int i = 0; i < invoices.length; i++) {
            sisaGaji -= invoices[i].getPayableAmount();
        }
        return sisaGaji;
    }

    public void buy(String itemName, int quantity, int price) {
        Invoice invoice = new Invoice(itemName, quantity, price);
        if (invoice.getPayableAmount() > this.getPayableAmount()) {
            System.out.println("Pembelian gagal!");
            System.out.println("Total tagihan melebihi saldo Anda bulan ini");
        } else {
            Invoice[] newInvoices = new Invoice[this.invoices.length + 1];

            for (int i = 0; i < this.invoices.length; i++) {
                newInvoices[i] = this.invoices[i];
            }

            newInvoices[invoices.length] = invoice;
            this.invoices = newInvoices;
            System.out.println("Pembelian berhasil!");
            System.out.println("Item telah ditambahkan ke tagihan Anda");
        }
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }
}