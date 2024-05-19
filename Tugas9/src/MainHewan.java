import java.util.Scanner;

public class MainHewan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Hewan hewan;
        System.out.print("Masukkan jenis hewan : ");
        String jenisHewan = sc.nextLine();
        
        switch (jenisHewan.toLowerCase()) {
            case "kucing":
                hewan = new Kucing("Melly");
                break;
            case "anjing":
                hewan = new Anjing("Dogy");
                break;
            case "kelinci":
                hewan = new Kelinci("Dorry");
                break;
            default:
                System.out.println("Jenis hewan tidak valid!");
                return;
        }

        Manusia manusia = new Manusia("Cindi", 19);
        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = sc.nextInt();
        
        System.out.println(" ");
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();
        manusia.tampilkanNama();
        manusia.tampilkanUmur();

        System.out.println(" ");
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
        hewan.tampilkanNama();
        hewan.tampilkanUmur();

        sc.close();
    }
}