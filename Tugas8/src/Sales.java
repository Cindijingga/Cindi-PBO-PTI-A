class Sales extends Pegawai {
    private double penjualan;
    private double komisi;
    private int pendapatan;

    public Sales(String nama, String noKTP, double penjualan, double komisi, int pendapatan) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
        this.pendapatan = pendapatan;
    }

    public double getPenjualan(){
        return this.penjualan;
    }
    
    public double getKomisi(){
        return this.komisi;
    }
    
    public void setPenjualan(int penjualan){
        this.penjualan = penjualan;
    }
    
    public void setKomisi(double komisi){
        this.komisi = komisi;
    }

    public void setPendapatan(int pendapatan){
        this.pendapatan = pendapatan;
    }
    
    public double getPendapatan(){
        return this.pendapatan;
    }

    @Override
    public double gaji() {
        return penjualan * komisi;
    }

    @Override
    public String toString(){
        return "Sales           : " + super.getNama() + "\nNo. KTP         : " + super.getNoKTP() + "\nTotal penjualan : " + ((double)getPenjualan())+ "\nBesaran komisi  : " + ((double)getKomisi()) + "\nPendapatan      : Rp " + ((int)gaji()) + "\n";
    }
}