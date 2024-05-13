public class HeroMagic extends Hero {
    private String power;

    public HeroMagic(String name, double health, String power) {
        super(name, health);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public void display() {
        System.out.println(getName() + " is a Magic Hero with power " + power);
    }
}
