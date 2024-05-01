import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia lakiLakiMenikah = new Manusia("Budi", true, "1234567890123456", true);
        System.out.println(lakiLakiMenikah);

        Manusia perempuanMenikah = new Manusia("Ani", false, "1234567890123457", true);
        System.out.println(perempuanMenikah);

        Manusia belumMenikah = new Manusia("Cici", false, "1234567890123458", false);
        System.out.println(belumMenikah);

        MahasiswaFILKOM ipkKurang3 = new MahasiswaFILKOM("Dimas", true, "1234567890123459", false, "165150600000", 2.5);
        System.out.println(ipkKurang3);

        MahasiswaFILKOM ipk3ke35 = new MahasiswaFILKOM("Eka", false, "1234567890123460", false, "165150600001", 3.2);
        System.out.println(ipk3ke35);

        MahasiswaFILKOM ipk35ke4 = new MahasiswaFILKOM("Fani", true, "1234567890123461", false, "165150600002", 3.8);
        System.out.println(ipk35ke4);

        LocalDate tahunMasuk2Tahun = LocalDate.of(2022, 04, 30); // Misalkan tanggal masuk 30 April 2022
        Pekerja pekerja2Tahun2Anak = new Pekerja("Gita", false, "1234567890123462", false, 5000, tahunMasuk2Tahun, 2);
        System.out.println(pekerja2Tahun2Anak);

        LocalDate tahunMasuk9Tahun = LocalDate.of(2015, 04, 30); // Misalkan tanggal masuk 30 April 2015
        Pekerja pekerja9Tahun = new Pekerja("Hadi", true, "1234567890123463", true, 6000, tahunMasuk9Tahun, 0);
        System.out.println(pekerja9Tahun);

        LocalDate tahunMasuk20Tahun = LocalDate.of(2004, 04, 30); // Misalkan tanggal masuk 30 April 2004
        Pekerja pekerja20Tahun10Anak = new Pekerja("Ika", false, "1234567890123464", false, 7000, tahunMasuk20Tahun, 10);
        System.out.println(pekerja20Tahun10Anak);

        LocalDate tahunMasukManager = LocalDate.of(2009, 04, 30); // Misalkan tanggal masuk 30 April 2009
        Manager manager = new Manager("Joko", true, "1234567890123465", true, 7500, tahunMasukManager, 0, "Teknologi Informasi");
        System.out.println(manager);
    }
}
