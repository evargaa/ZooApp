public class Animal {

    public  String name;
    public int age;
    public String origin;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String type;

    public boolean hasEaten;

    public boolean isHungry;

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isHasEaten() {
        return hasEaten;
    }

    public void setHasEaten(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    public Animal(String name, int age, String origin, String type) {
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.hasEaten = false;
        this.isHungry = true;
        this.type = type;
    }


    public  void eat() {
        this.hasEaten = true;
        System.out.println(name + " has eaten");
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void play() {
        isHungry = true;
        System.out.println(name + " is playing");
    }


    public  void makeSound() {
        System.out.println("Animal sound: default sound");
    }
}
