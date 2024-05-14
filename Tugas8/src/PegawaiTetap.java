class PegawaiTetap extends Pegawai {
    private double upah;
    private int pendapatan;

    public PegawaiTetap(String nama, String noKTP, double upah, int pendapatan) {
        super(nama, noKTP);
        this.upah = upah;
        this.pendapatan = pendapatan;
    }

    public void setUpah(double upah){
        this.upah = upah;
    }
    
    public double getUpah(){
        return this.upah;
    }

    public void setPendapatan(int pendapatan){
        this.pendapatan = pendapatan;
    }
    
    public double getPendapatan(){
        return this.pendapatan;
    }

    @Override
    public double gaji() {
        return upah;
    }

    @Override
    public String toString(){
        return "Pegawai Tetap   : " + super.getNama() + "\nNo. KTP         : " + super.getNoKTP() + "\nUpah            : " + getUpah() + "\nPendapatan      : Rp " + ((int)gaji()) +"\n";
    }
}