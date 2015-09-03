//define a class
public class Variables{
    
    //add a main method
    public static void main(String[] args) {
        
        float processorSpeed;
        byte numberProcessors;
        float computerSpeed;
        
        processorSpeed=2.3f;
        numberProcessors=3;
        
        computerSpeed=processorSpeed*numberProcessors;
        
        System.out.println("Computer Speed = " + computerSpeed);
    }
}