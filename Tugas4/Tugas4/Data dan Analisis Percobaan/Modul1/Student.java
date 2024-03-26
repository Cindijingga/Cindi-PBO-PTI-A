public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private double statusAkhir; //tmbhan
    private static int jumlahObjek = 0;
    
    public Student(){
        name = "";
        address = "";
        age = 0;
        jumlahObjek++;
    }

    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        jumlahObjek++;
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(int math){
        mathGrade = math;
    }

    public void setEnglish(int english){
        englishGrade = english;
    }

    public void setScience(int science){
        scienceGrade = science;
    }

    private double getAverage(){
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade)/3;
        return result;
    }

    //jawaban nomor 5
    public static void jmlObjek(){
        System.out.println("Jumlah Objek : "+jumlahObjek);
    }

    //Jawaban nomor 2
    public Student(String nama,String adres ,int umur, double math, double science, double english) {
        this.name = nama;
        this.address = adres;
        this.age = umur;
        this.mathGrade = math;
        this.scienceGrade = science;
        this.englishGrade = english;
        jumlahObjek++;
    }

    //Jawaban nomor 3
    public boolean statusAkhir() {
        double averageGrade = (mathGrade + scienceGrade + englishGrade) / 3;
        if (averageGrade >= 61) {
            return true; // Lolos
        } else {
            return false; // Remidi
        }
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama : "+name);
        System.out.println("Beralamat di : "+address);
        System.out.println("Berumur : "+age);
        System.out.println("Mempunyai nilai rata - rata : "+getAverage());
        //implementasi perintah nomor 3
        if (statusAkhir()) {
            System.out.println(name + " telah lolos!");
        } else {
            System.out.println(name + " harus mengulang!");
        }
    }
}