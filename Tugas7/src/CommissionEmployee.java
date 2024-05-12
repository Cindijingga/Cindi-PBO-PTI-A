import java.time.LocalDate;

public class CommissionEmployee extends Employee {

    private double grossSales; // total penjualan bulanan
    private double commissionRate; // tingkat komisi

    public CommissionEmployee(String name, String noKTP, LocalDate TanggalLahir, double sales, double rate) {
        super(name, noKTP, TanggalLahir);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    public void setGrossSales(double sales){
        grossSales = sales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setCommissionRate(double rate){
        commissionRate = rate;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    @Override
    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }
    @Override
    public String toString(){
        return String.format("Commision employee: "+super.toString()+"\ngross sales: "+getGrossSales()+"\ncommission rate"+getCommissionRate());
    }
}