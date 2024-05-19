public abstract class PermanentEmployee extends Employee {
    private int yearsOfService;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, int yearsOfService) {
        super(registrationNumber, name, salaryPerMonth);
        this.yearsOfService = yearsOfService;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    @Override
    public double getPayableAmount() {
        double total = 0;
        for (Invoice invoice : getInvoices()) {
            total += invoice.getPayableAmount();
        }
        return total;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Registration Number: " + getRegistrationNumber());
        System.out.println("Employee Salary: " + getSalaryPerMonth());
        System.out.println("Years of Service: " + yearsOfService);
    }

    public void calculateBonus() {
        double bonus = getSalaryPerMonth() * 0.1;
        System.out.println("Bonus: " + bonus);
    }
}