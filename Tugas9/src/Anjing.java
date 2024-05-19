class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, 0); 
    }

    @Override
    public void bersuara() {
        System.out.println("Guk! Guk!");
    }
}