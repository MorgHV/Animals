public class Main {
    public static void main(String[] args) {
        veterinar  veterinar = new veterinar();
        Dog dog  = new Dog("corm","dom","Soso","Pedigree");
        Cat cat = new Cat("ludei","les","Bartalamey","ProPlan");
        Hourse hourese = new Hourse("apple","lesostepnieGori","ParovozikTomas","Purpurniy");
        Animals[]allAnimals = {dog,cat,hourese};
        for(int i = 0; i<allAnimals.length;i++){
            veterinar.treatAnimal(allAnimals[i]);
        }

    }
}
