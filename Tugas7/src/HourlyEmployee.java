import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double hourlyWage; // upah per jam
    private double hoursWorked; // jam kerja bulanan

    public HourlyEmployee(String name, String noKTP, LocalDate TanggalLahir, double hourlyWage, double monthlyHours) {
        super(name, noKTP, TanggalLahir);
        setHourlyWage(hourlyWage);
        setHoursWorked(hoursWorked);
    }
    public void setHourlyWage(double upahPerJam) {
        hourlyWage = upahPerJam;
    }
    public double getHourlyWage() {
        return hourlyWage;
    }
    public void setHoursWorked(double jamKerja) {
        hoursWorked = jamKerja;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    @Override
    public double earnings() {
        if (getHoursWorked() <= 40)
            return getHourlyWage() * getHoursWorked();
        else
            return 40 * getHourlyWage() + (getHoursWorked() - 40) * getHourlyWage() * 1.5;
    }
    @Override
    public String toString() {
        return String.format("Karyawan per jam: %s\nupah per jam: %.2f\njam kerja: %.2f", super.toString(), getHourlyWage(), getHoursWorked());
    }
}