import java.util.InputMismatchException;
import java.util.Scanner;

// Main class for running the pet management application
public class App {
    private static final String FILENAME = "pets.dat";

    public static void main(String[] args) throws Exception {
        PetManager petManager = new PetManager();
        petManager.loadPetsFromFile(FILENAME);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println("1. Add a pet");
            System.out.println("2. Remove a pet");
            System.out.println("3. Display Pets");
            System.out.println("4. Feed a Pet");
            System.out.println("5. Put a Pet to Sleep");
            System.out.println("6. Play with a Pet");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");

            try{
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1:
                        System.out.print("Enter Pet Type (Dog/Cat/Bird): ");
                        String type = scanner.nextLine();
                        System.out.print("Enter Pet Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Pet Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Pet Color: ");
                        String color = scanner.nextLine();
    
                        Pet pet = null;
                        switch (type.toLowerCase()){
                            case "dog":
                                pet = new Dog();
                                break;
                            case "cat":
                                pet = new Cat();
                                break;
                            case "bird":
                                pet = new Bird();
                                break;
                            default:
                                System.out.println("Invalid pet type");
                                continue;
                        }
    
                        pet.setName(name);
                        pet.setAge(age);
                        pet.setColor(color);
                        petManager.addPet(pet);
                        break;
    
                    case 2:
                        System.out.println("Enter Pet Name to Remove: ");
                        String petNameToRemove = scanner.nextLine();
                        petManager.removePet(petNameToRemove);
                        break;
    
                    case 3:
                        petManager.displayPets();
                        break;
    
                    case 4:
                        System.out.print("Enter Pet Name to Feed");
                        String petNameToFeed = scanner.nextLine();
                        Pet petToFeed = petManager.getPetByName(petNameToFeed);
                        if (petToFeed != null){
                            petToFeed.eat();
                            System.out.println(petToFeed.getName() + " has been fed.");
                        } else{
                            System.out.println("Pet not found.");
                        }
                        break;
    
                    case 5:
                        System.out.println("Enter Pet Name to Put to Sleep: ");
                        String petNameToSleep = scanner.nextLine();
                        Pet petToSleep = petManager.getPetByName(petNameToSleep);
                        if (petToSleep != null){
                            petToSleep.sleep();
                            System.out.println(petToSleep.getName() + " is now sleeping");
                        } else{
                            System.out.println("Pet not found");
                        }
                        break;
    
                    case 6:
                        System.out.println("Enter Pet Name to Play with: ");
                        String petNameToPlay = scanner.nextLine();
                        Pet petToPlay = petManager.getPetByName(petNameToPlay);
                        if (petToPlay != null && petToPlay instanceof PetActions){
                            ((PetActions) petToPlay).play();
                        } else{
                            System.out.println("Pet not found or cannot play");
                        }
    
                    case 7:
                        petManager.savePetsToFile(FILENAME);
                        exit = true;
                        break;
                    
                    default:
                        System.out.println("Invalid choice. Please try again.");
                    }
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            } catch (Exception e){
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
