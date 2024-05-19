class Kelinci extends Hewan {
    public Kelinci(String nama) {
        super(nama, 0); 
    }

    @Override
    public void bersuara() {
        System.out.println("Cuit! Cuit!");
    }
}