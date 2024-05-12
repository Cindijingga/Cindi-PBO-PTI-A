// public class MainKue {

//     public static void main(String[] args) {
//         Kue[] kueArray = new Kue[20];

//         for (int i = 0; i < 20; i++) {
//             if (i % 2 == 0) {
//                 kueArray[i] = new KuePesanan("Kue Pesanan " + (i / 2 + 1), 10000.0, i % 2 + 1);
//             } else {
//                 kueArray[i] = new KueJadi("Kue Jadi " + (i / 2 + 1), 10000.0, i % 2 + 1);
//             }
//         }
       
//         // Tampilkan semua kue dan jenis kue
//         System.out.println("Daftar Kue:");
//         for (Kue kue : kueArray) {
//             System.out.println(kue.toString());
//         }

//         // Hitung total harga semua jenis kue
//         double totalHarga = 0;
//         for (Kue kue : kueArray) {
//             totalHarga += kue.hitungHarga();
//         }
//         System.out.println("Total Harga Semua Jenis Kue: " + totalHarga);

//         // Hitung total harga dan total berat dari KuePesanan
//         double totalHargaPesanan = 0;
//         double totalBeratPesanan = 0;
//         for (Kue kue : kueArray) {
//             if (kue instanceof KuePesanan) {
//                 totalHargaPesanan += kue.hitungHarga();
//                 totalBeratPesanan += ((KuePesanan) kue).berat;
//             }
//         }
//         System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
//         System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan);

//         // Hitung total harga dan total jumlah dari KueJadi
//         double totalHargaJadi = 0;
//         double totalJumlahJadi = 0;
//         for (Kue kue : kueArray) {
//             if (kue instanceof KueJadi) {
//                 totalHargaJadi += kue.hitungHarga();
//                 totalJumlahJadi += ((KueJadi) kue).jumlah;
//             }
//         }
//         System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
//         System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);

//         // Temukan kue dengan harga terbesar
//         double maxHarga = 0;
//         Kue kueTerbesar = null;
//         for (Kue kue : kueArray) {
//             if (kue.hitungHarga() > maxHarga) {
//                 maxHarga = kue.hitungHarga();
//                 kueTerbesar = kue;
//             }
//         }
//         System.out.println("Kue dengan Harga Terbesar: " + kueTerbesar);
//     }
// }


// bonus
import java.util.Scanner;

public class MainKue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kue[] kueArray = new Kue[20];

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua kue beserta jenisnya");
            System.out.println("2. Hitung total harga dari semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    tampilkanSemuaKue(kueArray);
                    break;
                case 2:
                    hitungTotalHargaSemuaKue(kueArray);
                    break;
                case 3:
                    hitungTotalHargaDanBeratPesanan(kueArray);
                    break;
                case 4:
                    hitungTotalHargaDanJumlahJadi(kueArray);
                    break;
                case 5:
                    tampilkanKueHargaTerbesar(kueArray);
                    break;
                case 6:
                    hitungTotalHargaDanLamaHariKueBasi(kueArray);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (choice != 0);
        
        sc.close();
    }
    private static void tambahKueBasi(Kue[] kueArray) {
      
    }

    private static void hitungTotalHargaDanLamaHariKueBasi(Kue[] kueArray) {
        double totalHargaKueBasi = 0;
        int totalLamaHariKueBasi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueBasi) {
                totalHargaKueBasi += kue.hitungHarga();
                totalLamaHariKueBasi += ((KueBasi) kue).getLamaHari();
            }
        }
        System.out.println("\nTotal Harga KueBasi: " + totalHargaKueBasi);
        System.out.println("Total Lama Hari KueBasi: " + totalLamaHariKueBasi);
    }
 
    private static void tampilkanSemuaKue(Kue[] kueArray) {
        System.out.println("\nDaftar Kue:");
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                System.out.println(kue.toString() + " (Kue Pesanan)");
            } else if (kue instanceof KueJadi) {
                System.out.println(kue.toString() + " (Kue Jadi)");
            }
        }
    }

    private static void hitungTotalHargaSemuaKue(Kue[] kueArray) {
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("\nTotal Harga Semua Kue: " + totalHarga);
    }

    private static void hitungTotalHargaDanBeratPesanan(Kue[] kueArray) {
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("\nTotal Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan);
    }

    private static void hitungTotalHargaDanJumlahJadi(Kue[] kueArray) {
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("\nTotal Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);
    }

    private static void tampilkanKueHargaTerbesar(Kue[] kueArray) {
        double maxHarga = 0;
        Kue kueTerbesar = null;
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > maxHarga) {
                maxHarga = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println("\nKue dengan Harga Terbesar: " + kueTerbesar.toString());
    }
}