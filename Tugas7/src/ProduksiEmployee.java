import java.time.LocalDate;

public class ProduksiEmployee extends Employee {

    private int productionPerWeek; // Jumlah produksi per minggu
    private double wagePerItem; // Upah per barang

    public ProduksiEmployee(String name, String noKTP, LocalDate TanggalLahir, int productionPerWeek, double wagePerItem) {
        super(name, noKTP, TanggalLahir);
        this.productionPerWeek = productionPerWeek;
        this.wagePerItem = wagePerItem;
    }

    @Override
    public double earnings() {
        return productionPerWeek * wagePerItem;
    }
}
