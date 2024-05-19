import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(i, String.valueOf((char) (65 + i)), 4_000_000 + i * 250_000);
        }

        while (true) {
            System.out.println("KOPERASI KARYAWAN");
            System.out.println("1. Lakukan pembelian");
            System.out.println("2. Cek sisa gaji");
            System.out.print("Masukkan pilihan Anda : ");
            int pilihan = sc.nextInt();
            System.out.print("Masukan nomor karyawan : ");
            int nomorKaryawan = sc.nextInt();

            Employee emp = null;
            for (Employee currentEmployee : employees) {
                if (nomorKaryawan == currentEmployee.getRegistrationNumber()) {
                    emp = currentEmployee;
                    break;
                }
            }
            
            if (emp == null) {
                System.out.println("Nomor karyawan tidak ditemukan!");
            } else {
                switch (pilihan) {
                    case 1:
                        sc.nextLine();
                        System.out.print("Masukkan nama item : ");
                        String itemName = sc.nextLine();
                        System.out.print("Masukkan harga item : ");
                        int price = sc.nextInt();
                        System.out.print("Masukkan jumlah pembelian : ");
                        int quantity = sc.nextInt();
                        break;
                    case 2:
                        System.out.printf("Nama : %s%nSisa gaji : %d%n%n", emp.getName(), emp.getPayableAmount());
                        if (emp.getInvoices().length > 0) {
                            System.out.println("Daftar pembelian:\n");
                            int tagihan = 0;
                            for (Invoice currentInvoice : emp.getInvoices()) {
                                int total = currentInvoice.getQuantity() * currentInvoice.getPricePerItem();
                                tagihan += total;
                                System.out.printf("Nama item : %s%nJumlah : %d%nHarga : %d%nTotal : %d%n", currentInvoice.getProductName(), currentInvoice.getQuantity(), currentInvoice.getPricePerItem(), total);
                            }
                            System.out.printf("\nTotal tagihan : %d%n", tagihan);
                        } else {
                            System.out.println("Anda belum melakukan pembelian bulan ini.");
                        }
                        break;
                }
            }
            System.out.println();
        }
    }
}
