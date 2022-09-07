public class Hourse extends Animals {
    String cvetSedla;
    public Hourse(String food, String location, String name, String cvetSedla) {
        super(food, location, name);
        this.cvetSedla=cvetSedla;
    }

    @Override
    public void makeNoise() {
        System.out.println("iiiigogo krichit loshadka)))");
    }
    @Override
    public void eat() {
        System.out.println("eat apple");
    }
}
