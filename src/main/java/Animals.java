public class Animals {
    String food;
    String location;
    String name;
    public Animals(String food, String location, String name){
        this.food = food;
        this.location = location;
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("аввава");
    }

    public void eat(){
        System.out.println("Kyshats");
    }

    public void sleep(){
        System.out.println("ззззззз");
    }
}
