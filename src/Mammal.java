public class Mammal extends Animal{


    public Mammal(String name, int age, String origin, String type) {
        super(name, age, origin, type);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(name + " is hungry for meat.");
    }

    @Override
    public void makeSound() {

        System.out.println(name + ": RAWR RAWR");
    }
}

