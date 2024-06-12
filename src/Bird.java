// Class representing a Bird, extending Pet and implementing PetActions
public class Bird extends Pet implements PetActions{
    // Fields
    private double wingSpan;

    // Getter for wingSpan
    public double getWingSpan(){
        return wingSpan;
    }

    // Setter for wingSpan
    public void setWingSpan(double wingSpan){
        this.wingSpan = wingSpan;
    }

    // Other methods
    @Override
    public void makeSound(){
        System.out.println("Chirp Chirp");
    }

    // PetActions inherited abstract methods
    @Override
    public void play(){
        System.out.println("Bird is playing with a mirror");
    }

    @Override
    public void performTrick(){
        System.out.println("Bird is performing a trick");
    }
}
