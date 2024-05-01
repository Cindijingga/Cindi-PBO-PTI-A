public class Manusia {

    private String nama;
    private boolean jenisKelamin; // true: laki-laki, false: perempuan
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public boolean isMenikah() {
        return menikah;
    }

    // Metode untuk menghitung tunjangan
    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    // Metode untuk menghitung pendapatan
    public double getPendapatan() {
        return getTunjangan();
    }

    // Metode toString untuk menampilkan informasi
    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
                "NIK: " + nik + "\n" +
                "Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\n" +
                "Status Menikah: " + (menikah ? "Menikah" : "Belum Menikah") + "\n" +
                "Tunjangan: $" + getTunjangan() + "\n" +
                "Pendapatan: $" + getPendapatan();
    }
}

