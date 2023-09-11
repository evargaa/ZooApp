public class Bird extends Animal{
    public Bird(String name, int age, String origin, String type) {
        super(name, age, origin, type);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println( name + " is eating insects all the time.");
    }

    @Override
    public void makeSound() {

        System.out.println(name + ": CHRIP CHRIP");
    }
}
