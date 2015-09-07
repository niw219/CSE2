public class variables2 {
    
    int count = 0;

public static void computespeed() {
    
    float processorSpeed = 2.3f;
    byte numberProcessors = 3;
    float computerSpeed;
    
    computerSpeed=processorSpeed*numberProcessors;
    count=5;
    System.out.println("Computer Speed = " + computerSpeed);
    System.out.println("count = " + count);
}

public static void addInterest(float interestrate) {
    
    float balance = 45;
    
    float newbalance = balance + (int)(balance*interestrate);
    System.out.println("new balance = " + newbalance);
    System.out.println("count = " + count);
}
    
}
