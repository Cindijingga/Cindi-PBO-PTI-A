public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = new Invoice[0];
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

    public abstract double getPayableAmount();
    public abstract int calculateNetSalary();

    public void addInvoice(Invoice invoice) {
        Invoice[] newInvoices = new Invoice[invoices.length + 1];
        System.arraycopy(invoices, 0, newInvoices, 0, invoices.length);
        newInvoices[invoices.length] = invoice;
        this.invoices = newInvoices;
    }

    public void EmployeeDetails() {
        System.out.println("=====================");
        System.out.println("Nama Karyawan: " + getName());
        System.out.println("Nomor Registrasi: " + getRegistrationNumber());
        System.out.println("Gaji Pokok: " + getSalaryPerMonth());
        System.out.println("Total Belanja: " + calculateTotalInvoiceAmount());
        System.out.println("Gaji Bersih: " + calculateNetSalary());
        System.out.println("Detail Belanja:");
        for (Invoice invoice : invoices) {
            System.out.println("- " + invoice.getProductName() + " (" + invoice.getQuantity() + " x " + invoice.getPricePerItem() + ") = " + invoice.getPayableAmount());
        }
    }

    private int calculateTotalInvoiceAmount() {
        int total = 0;
        for (Invoice invoice : invoices) {
            total += invoice.getPayableAmount();
        }
        return total;
    }
}