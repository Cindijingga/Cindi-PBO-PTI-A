import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseMonthlySalary; // gaji bulanan pokok

    public BasePlusCommissionEmployee(String name, String noKTP, LocalDate TanggalLahir, double monthlyGrossSales, double commissionRate, double baseMonthlySalary) {
        super(name, noKTP, TanggalLahir, monthlyGrossSales, commissionRate);
        this.baseMonthlySalary = baseMonthlySalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseMonthlySalary;
    }
}
