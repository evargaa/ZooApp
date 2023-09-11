public class Reptile extends Animal{
    public Reptile(String name, int age, String origin, String type) {
        super(name, age, origin, type);
    }

    @Override
    public void eat() {
        super.eat();
    System.out.println(name + " is eating diffently from other animals.");
    }

    @Override
    public void makeSound() {

        System.out.println(name + ": SHHHH SHHH");
    }
}
