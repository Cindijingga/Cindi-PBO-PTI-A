import java.time.LocalDate;

public class Pekerja extends Manusia {

    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    // Metode untuk menghitung bonus
    public double getBonus() {
        LocalDate now = LocalDate.now();
        int years = now.getYear() - tahunMasuk.getYear();
        if (years <= 5) {
            return gaji * 0.05;
        } else if (years <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }

    // Metode untuk menghitung gaji total
    public double getGajiTotal() {
        double totalGaji = gaji + getBonus();

        // Menambahkan tunjangan anak
        if (jumlahAnak > 0) {
            totalGaji += jumlahAnak * 20;
        }

        return totalGaji;
    }

    // Metode toString untuk menampilkan informasi
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Gaji: $" + gaji + "\n" +
                "Tahun Masuk: " + tahunMasuk + "\n" +
                "Jumlah Anak: " + jumlahAnak + "\n" +
                "Bonus: $" + getBonus() + "\n" +
                "Gaji Total: $" + getGajiTotal();
    }
}
