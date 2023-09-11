import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        int input;

        Reptile blackLizard = new Reptile("Black Lizard", 5, "Africa", "Reptile");
        Reptile greenAnaconda = new Reptile("Green Anaconda", 2, "Australia", "Reptile");
        Reptile seaTurtle = new Reptile("Sea Turtle", 67, "Africa", "Reptile");
        Reptile americanAligator = new Reptile("Amerian Aligator", 11, "South America", "Reptile");

        Bird owl = new Bird("Owl", 5, "Europe", "Bird");
        Bird toucan = new Bird("Toucan", 3, "South America", "Bird");
        Bird parrot = new Bird("Parrot", 8, "South America", "Bird");
        Bird eagle = new Bird("Eagle", 12, "North America", "Bird");

        Mammal lion = new Mammal("Lion", 2, "Africa", "Mammal");
        Mammal tiger = new Mammal("Tiger", 4, "Asia", "Mammal");
        Mammal elephant = new Mammal("Elephant", 12, "Africa", "Mammal");
        Mammal monkey = new Mammal("Monkey", 6, "Africa", "Mammal");

        Fish seaLion = new Fish("Sea Lion", 3, "Oceania", "Fish");
        Fish shark = new Fish("Shark", 5, "Oceania", "Fish");
        Fish killerWhale = new Fish("Killer Whale", 12, "Oceania", "Fish");
        Fish whale = new Fish("Whale", 5, "Oceania", "Fish");

        Insect Bee = new Insect("Bee", 2, "South America", "Insect");
        Insect prayingMantises = new Insect("Praying Mantises", 7, "Europe", "Insect");
        Insect ants = new Insect("Ants", 1, "South America", "Insect");
        Insect dragonFly = new Insect("Dragon Fly", 3, "Europe", "Insect");


        Amphibian mudSkipper = new Amphibian("Mud Skipper", 8, "Australia", "Amphibian");
        Amphibian axolotl = new Amphibian("Axolotl", 6, "Australia", "Amphibian");
        Amphibian toad = new Amphibian("Toad", 1, "Australia", "Amphibian");
        Amphibian treeFrog = new Amphibian("Tree Frog", 2, "Australia", "Amphibian");


        zoo.addAnimal(blackLizard);
        zoo.addAnimal(greenAnaconda);
        zoo.addAnimal(seaTurtle);
        zoo.addAnimal(americanAligator);

        // birds
        zoo.addAnimal(owl);
        zoo.addAnimal(toucan);
        zoo.addAnimal(parrot);
        zoo.addAnimal(eagle);

        // mammals
        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        // fish
        zoo.addAnimal(seaLion);
        zoo.addAnimal(shark);
        zoo.addAnimal(killerWhale);
        zoo.addAnimal(whale);

        // insects
        zoo.addAnimal(Bee);
        zoo.addAnimal(prayingMantises);
        zoo.addAnimal(ants);
        zoo.addAnimal(dragonFly);

        // amphibians
        zoo.addAnimal(axolotl);
        zoo.addAnimal(toad);
        zoo.addAnimal(mudSkipper);
        zoo.addAnimal(treeFrog);

        System.out.print("Loading: 0%");
        int percent = 0;
        try {
            while (percent <= 100) {
                Thread.sleep(300);
                System.out.print("\rLoading: " + percent + "%");
                percent += 10;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nLoading complete.");

        while (choice != 0) {
            System.out.println("\nWelcome to the Zoo of Vienna!");
            System.out.println("1. List all animals");
            System.out.println("2. Show details of an animal");
            System.out.println("3. Entertain the animals");
            System.out.println("4. Animal sound demonstration");
            System.out.println("5. Animal age statictics");
            System.out.println("6. List animals by type");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            try {
                input = Integer.parseInt(scanner.nextLine());
                System.out.println("The chosen option: " + input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid option. Please try again!");
                continue;
            }

            switch (input) {
                case 1:
                    zoo.listAnimal();
                    break;
                    case 2:
                        System.out.print("Searched animal: ");
                        String searchedName = scanner.nextLine();
                        zoo.searchAnimalByName(searchedName);
                        break;
                case 3:
                    zoo.letAnimalsPlay();
                    break;
                case 4:
                    zoo.makeAnimalSound();
                    break;
                case 5:
                    zoo.displayAgeStatistics();
                    break;
                case 6:
                    System.out.print("Enter animal type (e.g. Reptile, Bird, Mammal, Fish): ");
                    String animalType = scanner.nextLine();
                    zoo.listAnimalsByType(animalType);
                    break;
                case 0:
                    boolean validChoice = false;
                    do {
                        System.out.println("Are you sure you want to exit? (Y/N): ");
                        String confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("Y")) {
                            System.out.println("Good bye!");
                            scanner.close();
                            return; // Kilépés a programból
                        } else if (confirm.equalsIgnoreCase("N")) {
                            validChoice = true;
                        } else {
                            System.out.println("Invalid choice. Please enter Y or N.");
                        }
                    } while (!validChoice);
                    break;
                default:
                    System.out.println("Invalid option. Please try again!");
            }
        }

    }
    }
