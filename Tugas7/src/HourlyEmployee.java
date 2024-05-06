import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double hourlyWage; // upah per jam
    private double monthlyHours; // jam kerja bulanan

    public HourlyEmployee(String name, String noKTP, LocalDate TanggalLahir, double hourlyWage, double monthlyHours) {
        super(name, noKTP, TanggalLahir);
        this.hourlyWage = hourlyWage;
        this.monthlyHours = monthlyHours;
    }

    @Override
    public double earnings() {
        return hourlyWage * monthlyHours;
    }
}

   