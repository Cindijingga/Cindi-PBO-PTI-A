public class PermanentEmployee extends Employee {
    private String pensionPlan;

    public PermanentEmployee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices, String pensionPlan) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.pensionPlan = pensionPlan;
    }

    @Override
    public String workDetails() {
        return "Permanent Employee - Working full-time";
    }

    public void enrollPensionPlan() {
        System.out.println("Enrolling in pension plan: " + pensionPlan);
    }

    public String getPensionPlanDetails() {
        return "Pension Plan: " + pensionPlan;
    }
}
