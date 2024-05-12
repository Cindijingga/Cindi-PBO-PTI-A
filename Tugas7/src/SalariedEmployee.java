import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary; 
    public SalariedEmployee(String name, String noKTP, LocalDate TanggalLahir, double salary) {
        super(name, noKTP, TanggalLahir);
        setmonthlySalary(salary);
    }
    public void setmonthlySalary(double salary) {
        monthlySalary = salary;
    }
    public double getmonthlySalary() {
        return monthlySalary;
    }
    @Override
    public double earnings() {
        return getmonthlySalary();
    }
    @Override
    public String toString() {
        return String.format("Salaried employee: " +super.toString() +"\nweekly salary:" + getmonthlySalary());
    }
}