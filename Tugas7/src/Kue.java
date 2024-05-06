import java.util.Scanner;

abstract class Kue {
    String nama; //private dalam bonus
    double harga; //private dalam bonus

    // bonus
    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return "Nama Kue: " + nama + ", Harga: " + harga;
    }
}
