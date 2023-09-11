import java.util.ArrayList;
import java.util.Iterator;
public class Zoo {
    public static ArrayList<Animal> animals;

    public Zoo (){
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(int age, String name, String origin) {
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getAge() == age && animal.getName().equals(name) && animal.getOrigin().equals(origin)) {
                iterator.remove();
                break;
            }
        }
    }

    public void listAnimal() {
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name + ", Age: " + animal.age +
                    ", Origin: " + animal.origin + ". Has eaten: " + animal.hasEaten);
        }
    }

    public void updateAnimal(String name, int age, String origin, String newName, int newAge, String newOrigin) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name) && animal.getAge() == age && animal.getOrigin().equals(origin)) {
                animal.setName(newName);
                animal.setAge(newAge);
                animal.setOrigin(newOrigin);
                break;
            }
        }
    }

    public void feedAnimals(){
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public void letAnimalsPlay() {
        for (Animal animal : animals) {
            animal.play();
        }
    }

    public void feedHungryAnimals() {
        for (Animal animal : animals) {
            if (animal.isHungry()) {
                animal.eat();
            }
        }
    }
    public void makeAnimalSound() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void searchAnimalByName(String name) {
        boolean found = false;

        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.println("Name: " + animal.getName());
                System.out.println("Age: " + animal.getAge());
                System.out.println("Origin: " + animal.getOrigin());
                System.out.println("------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("There is no such animal in the zoo.");
        }
    }
    public double calculateAverageAge() {
        if (animals.isEmpty()) {
            return 0;
        }

        int totalAge = 0;
        for (Animal animal : animals) {
            totalAge += animal.getAge();
        }

        return (double) totalAge / animals.size();
    }
    public Animal findOldestAnimal() {
        if (animals.isEmpty()) {
            return null;
        }

        Animal oldest = animals.get(0);
        for (Animal animal : animals) {
            if (animal.getAge() > oldest.getAge()) {
                oldest = animal;
            }
        }

        return oldest;
    }
    public Animal findYoungestAnimal() {
        if (animals.isEmpty()) {
            return null;
        }

        Animal youngest = animals.get(0);
        for (Animal animal : animals) {
            if (animal.getAge() < youngest.getAge()) {
                youngest = animal;
            }
        }

        return youngest;
    }
    public void displayAgeStatistics() {
        System.out.println("Animal age statistics:");
        System.out.println("Avarage age: " + calculateAverageAge());

        Animal oldestAnimal = findOldestAnimal();
        if (oldestAnimal != null) {
            System.out.println("Oldest animal: " + oldestAnimal.getName() + " (" + oldestAnimal.getAge() + " years old)");
        }

        Animal youngestAnimal = findYoungestAnimal();
        if (youngestAnimal != null) {
            System.out.println("Youngest animal: " + youngestAnimal.getName() + " (" + youngestAnimal.getAge() + " years old)");
        }
    }
    public void listAnimalsByType(String type) {
        boolean found = false;
        System.out.println("Animals of type: " + type);
        for (Animal animal : animals) {
            if (animal.getType().equalsIgnoreCase(type)) {
                System.out.println("Name: " + animal.getName());
                System.out.println("Age: " + animal.getAge());
                System.out.println("Origin: " + animal.getOrigin());
                System.out.println("------------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No animals of this type in the zoo.");
        }
    }


}
