public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300);
        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
   
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% :$%,.2f\n", employee.getBaseSalary());
            }
        System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
 




// import java.time.LocalDate;
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input data karyawan
//         System.out.print("Nama: ");
//         String name = sc.nextLine();

//         System.out.print("No. KTP: ");
//         String noKTP = sc.nextLine();

//         System.out.print("Tahun Lahir: ");
//         int year = sc.nextInt();

//         System.out.print("Bulan Lahir: ");
//         int month = sc.nextInt();

//         System.out.print("Hari Lahir: ");
//         int day = sc.nextInt();

//         LocalDate TanggalLahir = LocalDate.of(year, month, day);

//         // Pilih tipe karyawan
//         System.out.print("Pilih tipe karyawan (1=Salaried, 2=Hourly, 3=Commission, 4=BasePlusCommission, 5=Production): ");
//         int choice = sc.nextInt();

//         Employee employee = null;
//         switch (choice) {
//             case 1:
//                 System.out.print("Gaji Bulanan: ");
//                 double monthlySalary = sc.nextDouble();
//                 employee = new SalariedEmployee(name, noKTP, TanggalLahir, monthlySalary);
//                 break;
//             case 2:
//                 System.out.print("Upah Per Jam: ");
//                 double hourlyWage = sc.nextDouble();
//                 System.out.print("Jumlah Jam Kerja Bulanan: ");
//                 double monthlyHours = sc.nextDouble();
//                 employee = new HourlyEmployee(name, noKTP, TanggalLahir, hourlyWage, monthlyHours);
//                 break;
//             case 3:
//                 System.out.print("Penjualan Bulanan: ");
//                 double monthlyGrossSales = sc.nextDouble();
//                 System.out.print("Tingkat Komisi: ");
//                 double commissionRate = sc.nextDouble();
//                 employee = new CommissionEmployee(name, noKTP, TanggalLahir, monthlyGrossSales, commissionRate);
//                 break;
//             case 4:
//                 System.out.print("Penjualan Bulanan: ");
//                 monthlyGrossSales = sc.nextDouble();
//                 System.out.print("Tingkat Komisi: ");
//                 commissionRate = sc.nextDouble();
//                 System.out.print("Gaji Bulanan Pokok: ");
//                 double baseMonthlySalary = sc.nextDouble();
//                 employee = new BasePlusCommissionEmployee(name, noKTP, TanggalLahir, monthlyGrossSales, commissionRate, baseMonthlySalary);
//                 break;
//             case 5:
//                 System.out.print("Jumlah Produksi Per Minggu: ");
//                 int productionPerWeek = sc.nextInt();
//                 System.out.print("Upah Per Barang: ");
//                 double wagePerItem = sc.nextDouble();
//                 employee = new ProduksiEmployee(name, noKTP, TanggalLahir, productionPerWeek, wagePerItem);
//                 break;
//             default:
//                 System.out.println("Pilihan tidak valid.");
//                 break;
//         }

//         // Process employee polymorphically (add this section)
//         if (employee != null) {
//             System.out.println("\nDetail Karyawan:");
//             System.out.println(employee); // Polymorphic toString()
//             System.out.printf("Pendapatan: $%,.2f\n", employee.earnings()); // Polymorphic earnings()
//         }
//     }
// }