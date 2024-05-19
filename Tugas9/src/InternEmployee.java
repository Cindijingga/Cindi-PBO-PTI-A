public abstract class InternEmployee extends Employee implements Contract {
    private String universityName;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, String universityName) {
        super(registrationNumber, name, salaryPerMonth);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    @Override
    public double getPayableAmount() {
        return getSalaryPerMonth();
    }

    public void EmployeeDetails() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Registration Number: " + getRegistrationNumber());
        System.out.println("Employee Salary: " + getSalaryPerMonth());
        System.out.println("University Name: " + universityName);
    }

    public void checkEligibility() {
        System.out.println("Eligible for Scholarship: Yes");
    }
}
