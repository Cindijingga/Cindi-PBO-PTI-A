public class Perusahaan {
    public static void main(String[] args) {
        Pegawai PegawaiTetap = new PegawaiTetap("Budi","350720490327424092342",2000000.0,2000000);
        Pegawai PegawaiHarian = new PegawaiHarian("Edo","350720490327424092343",8600.0,40.0,340000);
        Pegawai Sales = new Sales("Tika","350720490327424092344",50.0,50000.0,2500000);
        
        System.out.println(PegawaiTetap.toString());
        System.out.println(PegawaiHarian.toString());
        System.out.println(Sales.toString());
    }
}