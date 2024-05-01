public class MahasiswaFILKOM extends Manusia {

    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    // Metode untuk mendapatkan status
    public String getStatus() {
        String prodi = "";
        int prodiCode = Integer.parseInt(String.valueOf(getNik().charAt(6)));
        switch (prodiCode) {
            case 2:
                prodi = "Teknik Informatika";
                break;
            case 3:
                prodi = "Teknik Komputer";
                break;
            case 4:
                prodi = "Sistem Informasi";
                break;
            case 6:
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi Tidak Dikenal";
        }

        String angkatan = String.valueOf(getNik().substring(0, 2)) + "0000";
        return prodi + ", " + angkatan;
    }

    // Metode untuk mendapatkan beasiswa
    public double getBeasiswa() {
        if (ipk >= 3.5 && ipk <= 4) {
            return 75;
        } else if (ipk >= 3 && ipk < 3.5) {
            return 50;
        } else {
            return 0;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nIPK: " + ipk + "\nStatus: " +getStatus();
    }
} 