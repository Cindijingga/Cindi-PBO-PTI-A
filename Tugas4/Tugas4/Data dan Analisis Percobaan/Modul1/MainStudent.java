import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        //jawaban nomor 4
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int numberOfStudents = input.nextInt();
        Student [] students = new Student[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            System.out.println("Masukkan data siswa ke-" + (i+1) + ": ");
            System.out.print("Nama: ");
            String name = input.next();
            System.out.print("Alamat: ");
            String address = input.next();
            System.out.print("Umur: ");
            int age = input.nextInt();
            System.out.print("Nilai Matematika: ");
            double mathGrade = input.nextDouble();
            System.out.print("Nilai IPA: ");
            double scienceGrade = input.nextDouble();
            System.out.print("Nilai Bahasa Inggris: ");
            double englishGrade = input.nextDouble();

        } 

        System.out.println("==============================");
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
       
        //menggunakan constructor lain
        System.out.println("================================================");
        Student chris = new Student("Chris","Kediri",21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();
        
        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("================================================");
        anna = new Student("anna","Batu",18);
        anna.displayMessage();

        //siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("==================================================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        //implementasi constructor perintah nomor 2
        System.out.println("================================================");
        Student daniel = new Student("Daniel","Sragen",23,80.0,88.0,93.0);
        daniel.displayMessage();
        
        System.out.println("===============================================");
        Student.jmlObjek();
        
    }
}