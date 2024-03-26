public class lingkaran {
    int alas, tinggi;
    
    public lingkaran(int alas){
        this.alas = alas;
    }

    public lingkaran (int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //jawaban nomor 2
    // public lingkaran(int tinggi){
    //     this.tinggi = tinggi;
    // }

    // //jawaban nomor 3
    // public lingkaran(String alas, String tinggi){
    //     this.alas = parseInt(alas);
    //     this.tinggi = parseInt(tinggi);
    // }
    // private int parseToInt(String str){
    //     try{
    //         return Integer.parseInt(str);
    //     }catch(NumberFormatException e){
    //         System.out.println("Parsing value tidak sesuai : " + e.getMassage);
    //         return 0;
    //     }
    // }

    public void setAlas(int alas){
        this.alas = alas;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public int getAlas(){
        return alas;
    }

    public int getTinggi(){
        return tinggi;
    }

    public double hitungLuas(){
        double hasil = (double) (getTinggi()*getAlas())/2;
        return hasil;
    }

    public void displayMessage(){
        System.out.println("Hitung Luas : " + hitungLuas());
    }

    
}