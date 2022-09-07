public class Cat extends Animals {
    String NazvanieLubimogoKoshachegoKorma;
    public Cat(String food, String location, String name,String nazvanieLubimogoKoshachegoKorma) {
        super(food, location, name);
        this.NazvanieLubimogoKoshachegoKorma = nazvanieLubimogoKoshachegoKorma;
    }
    @Override
    public void makeNoise() {
        System.out.println("miuuu");
    }

    @Override
    public void eat() {
        System.out.println("eat korm");

    }
}
