public class Fish extends Animal {

    public Fish(String name, int age, String origin, String type) {
        super(name, age, origin, type);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("The " + name + " is currently eating worms");
    }

    public void swim() {

        System.out.println("The " + name + " is currently swimming");
    }

    @Override
    public void makeSound() {

        System.out.println(name + ": BLOU BLOU");
    }
}
