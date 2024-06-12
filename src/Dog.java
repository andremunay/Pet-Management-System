// Class representing a Dog, extending Pet and implementing PetActions
public class Dog extends Pet implements PetActions { 
    // Fields
    private String breed;

    // Getter for breed
    public String getBreed(){
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed){
        this.breed = breed;
    }

    // Other methods
    @Override
    public void makeSound(){
        System.out.println("Woof Woof");
    }

    // PetActions inherited abstract methods
    @Override
    public void play(){
        System.out.println("Dog is playing fetch");
    }

    @Override
    public void performTrick(){
        System.out.println("Dog is performing a trick");
    }
}
