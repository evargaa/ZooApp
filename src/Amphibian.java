public class Amphibian extends Animal{
    public Amphibian(String name, int age, String origin, String type) {
        super(name, age, origin, type);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println( name + " is eating flies");
    }

    @Override
    public void makeSound() {

        System.out.println(name + ": MOU MOU");
    }
}
