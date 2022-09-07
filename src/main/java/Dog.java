public class Dog extends Animals {
    String NazvanieLubimogoSobKorm;
    public Dog(String food, String location, String name, String nazvanieLubimogoSobKorm) {
        super(food, location, name);
        this.NazvanieLubimogoSobKorm = nazvanieLubimogoSobKorm;
    }
    @Override
    public void makeNoise() {
        System.out.println("GAv-Gav");
    }
    @Override
    public void eat() {
        System.out.println("eat korm");

    }
}

