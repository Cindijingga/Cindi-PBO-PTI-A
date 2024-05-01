public class MainEmployee {
    public static void main(String[] args) {
        // Membuat objek Manager dengan parameter sesuai konstruktor
        Manager1 boss = new Manager1("Steven", 80000, 1987, 12, 15);
        boss.setBonus(5000); // Menetapkan bonus untuk boss

        // Membuat objek Employee dengan parameter sesuai konstruktor
        Employee staff = new Employee("Donni", 50000, 1989, 10, 1);

        // Menampilkan informasi nama dan gaji boss dan staff
        System.out.println("Nama boss: " + boss.getName() + ", salary = " + boss.getSalary());
        System.out.println("Nama staff: " + staff.getName() + ", salary = " + staff.getSalary());
    }
}
