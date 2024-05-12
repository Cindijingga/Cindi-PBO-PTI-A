import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate TanggalLahir; //no 4

    public Employee(String name, String noKTP, LocalDate TanggalLahir){
        this.name = name;
        this.noKTP = noKTP;
        this.TanggalLahir = TanggalLahir;
    }
    public LocalDate getTanggalLhir() {
        return TanggalLahir;
    }
    public void setTanggalLahir(LocalDate TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }
    public String getName(){
        return name;
    }
    public String getNoKTP(){
        return noKTP;
    }
    @Override
    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP:"+getNoKTP());
    }
    public abstract double earnings();
}  