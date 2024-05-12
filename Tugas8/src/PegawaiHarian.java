class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private double totalJamKerja;
    private int pendapatan;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, double totalJamKerja, int pendapatan) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJamKerja = totalJamKerja;
        this.pendapatan = pendapatan;
    }

    public double getUpahPerJam(){
        return this.upahPerJam;
    }
    
    public double getTotalJam(){
        return this.totalJamKerja;
    }
    
    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }
    
    public void setTotalJam(int totalJamKerja){
        this.totalJamKerja = totalJamKerja;
    }

    public void setPendapatan(int pendapatan){
        this.pendapatan = pendapatan;
    }
    
    public double getPendapatan(){
        return this.pendapatan;
    }

    @Override
    public double gaji() {
        if (totalJamKerja <= 40) {
            return upahPerJam * totalJamKerja;
        } else {
            int jamNormal = 40;
            double jamLembur = totalJamKerja - jamNormal;
            return (upahPerJam * jamNormal) + (jamLembur * upahPerJam * 1.5);
        }
    }

    @Override
    public String toString(){
        return "Pegawai Harian  : " + super.getNama() + "\nNo. KTP         : " + super.getNoKTP() + "\nUpah/jam        : Rp " + getUpahPerJam() + "\nTotal jam kerja : " + ((double)getTotalJam()) + "\nPendapatan      : Rp " + ((int)gaji()) + "\n";
    }
}
