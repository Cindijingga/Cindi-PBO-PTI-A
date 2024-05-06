public class KueBasi extends Kue {
    private int lamaHari;

    public KueBasi(String nama, double harga, int lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    public int getLamaHari() {
        return lamaHari;
    }

    public void setLamaHari(int lamaHari) {
        this.lamaHari = lamaHari;
    }

    @Override
    public double hitungHarga() {
        double diskon = lamaHari * (super.getHarga() * 0.1);
        return super.getHarga() - diskon;
    }
}