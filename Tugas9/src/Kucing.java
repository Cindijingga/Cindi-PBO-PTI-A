class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, 0); 
    }

    @Override
    public void bersuara() {
        System.out.println("Miaow!");
    }
}
