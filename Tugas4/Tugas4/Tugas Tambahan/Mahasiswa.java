public class Mahasiswa {
    private String nama;
    private int NIM;
    private String prodi;
    private boolean jenisKelamin;

    //construktor overloading
    public Mahasiswa(String nama, int NIM, String prodi, boolean jenisKelamin) {
        this.nama = nama;
        this.NIM = NIM;
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
    }
    public Mahasiswa() {
        nama = "Budi Doremi";
        NIM = 12345;
        prodi = "Pendidikan Teknologi Informasi";
        jenisKelamin = true;
    }
    public Mahasiswa(String prodi, boolean jenisKelamin) {
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
        nama = "Lili";
        NIM = 22456;
    }

    //method overloading
    public void main() {
        System.out.println(" Nama : " +nama);
        System.out.println("NIM : " +NIM);
        System.out.println("Prodi : " +prodi);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Perempuan" : "Laki-Laki"));
    }
    public void pinjamBuku(String nama) {
        System.out.println(nama + "sedang meminjam buku di perpustakaan");
    }
    public void kembalikanBuku() {
        System.out.println(nama + "akan menggembalikan buku yang dipinjamnya di perpustakaan");
    }

    //instan method
    void tambahBuku() {
        System.out.println("Sedang menambah buku");
    }
}