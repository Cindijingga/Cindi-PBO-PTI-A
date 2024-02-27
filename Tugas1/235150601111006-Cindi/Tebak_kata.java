import java.util.Scanner;

public class Tebak_kata {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] kataKunci = {"mangga", "apel", "sirsak", "pisang", "blueberry"};
    String kataAcak = kataKunci[getRandomIndex(kataKunci.length)];
    int kesempatan = 0;
    boolean selesai = false;

    while (!selesai) {
        System.out.print("Tebak Kata ");
        String tebakan = sc.nextLine().toLowerCase();
        kesempatan++;

        if(tebakan.equals(kataAcak)) {
            selesai = true;
            System.out.println("Selamat! Kata " + kataAcak + " adalah kata kunci." );
        } else {
            System.out.println("Salah! Silahkan coba lagi.");
        }
    }
    
    System.out.println("Jumlah pengujian: " + kesempatan);
    }
    public static int getRandomIndex(int max) {
    return (int) (Math.random() * max);
    }
}