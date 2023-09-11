public class Insect extends Animal{


    public Insect(String name, int age, String origin, String type) {
        super(name, age, origin, type);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("The " + name + " is currently eating fruits");
    }
    public void sleep() {
        System.out.println("The " + name + " is currently sleeping");
    }

    @Override
    public void makeSound() {

        System.out.println(name + ": CRP CRP");
    }
}
