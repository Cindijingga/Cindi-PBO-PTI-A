public class KuePesanan extends Kue {
    double berat; // private dalam bonus

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    // bonus
    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * getBerat(); 
    }
}
