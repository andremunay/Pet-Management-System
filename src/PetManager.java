import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Class for managing a list of pets
public class PetManager implements Serializable {
    // Fields
    private static final long serialVersionUID = 1L;
    private List<Pet> pets;

    // Constructor
    public PetManager(){
        this.pets = new ArrayList<>();
    }

    // Method to add a pet
    public void addPet(Pet pet){
        pets.add(pet);
    }

    // Method to remove a pet by name
    public void removePet(String name){
        pets.removeIf(pet -> pet.getName().equalsIgnoreCase(name));
    }

    // Method to display all pets
    public void displayPets(){
        for (Pet pet : pets){
            System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge() + ", Color: " + pet.getColor());
            pet.makeSound();
            if (pet instanceof PetActions){
                ((PetActions) pet).play();
                ((PetActions) pet).performTrick();
            }
        }
    }

    // Method to get a pet by name
    public Pet getPetByName(String name){
        for (Pet pet : pets){
            if (pet.getName().equalsIgnoreCase(name)){
                return pet;
            }
        }
        return null;
    }

    // Method to save pets to a file
    public void savePetsToFile(String filename){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(pets);
        } catch (IOException e){
            System.err.println("Error saving pets to file: " + e.getMessage());
        }
    }

    // Method to load pets from a file
    public void loadPetsFromFile(String filename){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            pets = (List<Pet>) ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.err.println("Error loading pets from file " + e.getMessage());
        }
    }
}
