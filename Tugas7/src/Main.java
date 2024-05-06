import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Nama: ");
        String name = sc.nextLine();

        System.out.print("No. KTP: ");
        String noKTP = sc.nextLine();

        System.out.print("Tahun Lahir: ");
        int year = sc.nextInt();

        System.out.print("Bulan Lahir: ");
        int month = sc.nextInt();

        System.out.print("Hari Lahir: ");
        int day = sc.nextInt();

        LocalDate TanggalLahir = LocalDate.of(year, month, day);

        // Pilih tipe karyawan
        System.out.print("Pilih tipe karyawan (1=Salaried, 2=Hourly, 3=Commission, 4=BasePlusCommission, 5=Production): ");
        int choice = sc.nextInt();

        Employee employee = null;
        switch (choice) {
            case 1:
                System.out.print("Gaji Bulanan: ");
                double monthlySalary = sc.nextDouble();
                employee = new SalariedEmployee(name, noKTP, TanggalLahir, monthlySalary);
                break;
            case 2:
                System.out.print("Upah Per Jam: ");
                double hourlyWage = sc.nextDouble();
                System.out.print("Jumlah Jam Kerja Bulanan: ");
                double monthlyHours = sc.nextDouble();
                employee = new HourlyEmployee(name, noKTP, TanggalLahir, hourlyWage, monthlyHours);
                break;
            case 3:
                System.out.print("Penjualan Bulanan: ");
                double monthlyGrossSales = sc.nextDouble();
                System.out.print("Tingkat Komisi: ");
                double commissionRate = sc.nextDouble();
                employee = new CommissionEmployee(name, noKTP, TanggalLahir, monthlyGrossSales, commissionRate);
                break;
            case 4:
                System.out.print("Penjualan Bulanan: ");
                monthlyGrossSales = sc.nextDouble();
                System.out.print("Tingkat Komisi: ");
                commissionRate = sc.nextDouble();
                System.out.print("Gaji Bulanan Pokok: ");
                double baseMonthlySalary = sc.nextDouble();
                employee = new BasePlusCommissionEmployee(name, noKTP, TanggalLahir, monthlyGrossSales, commissionRate, baseMonthlySalary);
                break;
            case 5:
                System.out.print("Jumlah Produksi Per Minggu: ");
                int productionPerWeek = sc.nextInt();
                System.out.print("Upah Per Barang: ");
                double wagePerItem = sc.nextDouble();
                employee = new ProduksiEmployee(name, noKTP, TanggalLahir, productionPerWeek, wagePerItem);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        // Process employee polymorphically (add this section)
        if (employee != null) {
            System.out.println("\nDetail Karyawan:");
            System.out.println(employee); // Polymorphic toString()
            System.out.printf("Pendapatan: $%,.2f\n", employee.earnings()); // Polymorphic earnings()
        }
    }
}