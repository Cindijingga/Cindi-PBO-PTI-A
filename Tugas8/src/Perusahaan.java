public class Perusahaan {
    public static void main(String[] args) {
        Pegawai PegawaiTetap1 = new PegawaiTetap("Budi","350720490327424092342",2000000.0,2000000);
        Pegawai PegawaiTetap2 = new PegawaiTetap("Doni","350720490327424092352",3000000.0,4500000);
        Pegawai PegawaiTetap3 = new PegawaiTetap("Roni","350720490327424092362",2500000.0,3000000);

        Pegawai PegawaiHarian1 = new PegawaiHarian("Edo","350720490327424092343",8600.0,40.0,340000);
        Pegawai PegawaiHarian2 = new PegawaiHarian("Mail","350720490327424092353",8000.0,20.0,300000);
        Pegawai PegawaiHarian3 = new PegawaiHarian("Edi","350720490327424092363",9000.0,40.0,500000);

        Pegawai Sales1 = new Sales("Tika","350720490327424092344",50.0,50000.0,2500000);
        Pegawai Sales2 = new Sales("Rena","350720490327424092354",30.0,40000.0,500000);
        Pegawai Sales3 = new Sales("Aura","350720490327424092364",70.0,90000.0,4500000);
        
        // Upcasting atau downcasting
        PegawaiHarian UpHarian = new PegawaiHarian("Sintia", "350720490327424092365", 100000.0, 10, 520000);
        Pegawai UpCasHarian = (Pegawai) UpHarian;

        PegawaiHarian DownHarian = (PegawaiHarian) UpCasHarian;

        Sales UpSales = new Sales("Tita", "350720490327424092300", 50.0, 20000.0, 1400000);
        Pegawai UpCasSales = (Pegawai) UpSales;

        Sales DownSales = (Sales) UpCasSales;

        System.out.println(PegawaiTetap1.toString());
        System.out.println(PegawaiTetap2.toString());
        System.out.println(PegawaiTetap3.toString());

        System.out.println(PegawaiHarian1.toString());
        System.out.println(PegawaiHarian2.toString());
        System.out.println(PegawaiHarian3.toString()); 

        System.out.println(Sales1.toString());
        System.out.println(Sales2.toString());
        System.out.println(Sales3.toString());

        System.out.println(UpHarian.toString());
        System.out.println(DownHarian.toString());
        System.out.println(UpSales.toString());
        System.out.println(DownSales.toString());
    }
}