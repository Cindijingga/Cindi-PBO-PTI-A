import java.time.LocalDate;

public class Manager extends Pekerja {

    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    // Metode untuk menghitung bonus (dengan tambahan tunjangan manager)
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (super.getGaji() * 0.1);
    }

    // Metode toString untuk menampilkan informasi
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Departemen: " + departemen;
    }
}
