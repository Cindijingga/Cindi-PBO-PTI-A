import java.time.LocalDate;

public class CommissionEmployee extends Employee {

    private double monthlyGrossSales; // total penjualan bulanan
    private double commissionRate; // tingkat komisi

    public CommissionEmployee(String name, String noKTP, LocalDate TanggalLahir, double monthlyGrossSales, double commissionRate) {
        super(name, noKTP, TanggalLahir);
        this.monthlyGrossSales = monthlyGrossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return monthlyGrossSales * commissionRate;
    }
}
