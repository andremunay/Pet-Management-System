// Class representing a Cat, extending Pet and implementing PetActions
public class Cat extends Pet implements PetActions{
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
        System.out.println("Meow Meow");
    }

    // PetActions inherited abstract methods
    @Override
    public void play(){
        System.out.println("Cat is playing with a ball of yarn");
    }

    @Override
    public void performTrick(){
        System.out.println("Cat is performing a trick");
    }
}
