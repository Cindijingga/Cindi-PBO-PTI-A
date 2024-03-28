import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Customer {
    private String noPelanggan;
    private String nama;
    private double saldo;
    private int pin;
    private int authAttempts;

    // Konstruktor
    public Customer(String noPelanggan, String nama, double saldo, int pin) {
        this.noPelanggan = noPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.authAttempts = 0;
    }

    // Getter 
    public String getNoPelanggan() {
        return noPelanggan;
    }
    
    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }

    // Method untuk melakukan transaksi pembelian
    public void beli(double totalBelanja) {
        if (totalBelanja <= saldo) {
            double cashback = 0.0;
            if (totalBelanja > 100_000) {
                if (noPelanggan.startsWith("38")) {
                    cashback = totalBelanja * 0.05;
                } else if (noPelanggan.startsWith("56")) {
                    cashback = totalBelanja * 0.07;
                } else if (noPelanggan.startsWith("74")) {
                    cashback = totalBelanja * 0.10;
                }
            } else {
                if (noPelanggan.startsWith("56")) {
                    cashback = totalBelanja * 0.02;
                } else if (noPelanggan.startsWith("74")) {
                    cashback = totalBelanja * 0.05;
                }
            }
            saldo -= totalBelanja - cashback;
            System.out.println("Transaksi berhasil! Saldo Anda sekarang: " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi untuk transaksi ini.");
        }
    }

    // Method untuk melakukan top up saldo
    public void topUp(double amount) {
        saldo += amount;
        System.out.println("Top up berhasil! Saldo Anda sekarang: " + saldo);
    }

    // Method untuk melakukan autentikasi dengan PIN
    public boolean authenticate(int pinAttempt) {
        if (pinAttempt == pin) {
            authAttempts = 0; 
            return true;
        } else {
            authAttempts++;
            System.out.println("PIN salah! Percobaan ke-" + authAttempts);
            if (authAttempts >= 3) {
                System.out.println("Akun Anda diblokir");
                System.out.println("Silahkan hubungi layanan terdekat kami");
                System.out.println("Untuk menonaktifkan status blokir");
            }
            return false;
        }
    }
}

public class TugasPraktikum {
    private static Map<String, Customer> customers = new HashMap<>();

    public static void main(String[] args) {
        // Menambahkan data pelanggan contoh
        customers.put("1122334455", new Customer("1122334455", "Budi", 1000_000, 1234));
        customers.put("1234567889", new Customer("1234567889", "Wati", 2000_000, 5678));
        customers.put("9877654321", new Customer("9877654321", "Ani", 1500_000, 9876));

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor pelanggan: ");
        String noPelanggan = input.nextLine();

        System.out.print("Masukkan PIN: ");
        int pinAttempt = input.nextInt();

        Customer customer = customers.get(noPelanggan);

        if (customer != null && !customer.authenticate(pinAttempt)) {
            System.out.println("Autentikasi gagal. Program berakhir.");
            return;
        }

        System.out.println("Autentikasi berhasil. Selamat datang, " + customer.getNama());

        // Contoh transaksi pembelian
        customer.beli(600_000);

        // Contoh top up saldo
        customer.topUp(125_000);
    }
}
