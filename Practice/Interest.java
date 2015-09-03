public class Interest{
    
    public static void main(String[] args){
        
        int accountBalance;
        float interestRate;
        float interest;
        int newBalance;
        
        
        accountBalance=1000;
        interestRate=0.07f;
       
        interest = accountBalance*interestRate;
        newBalance = accountBalance+interest;
        
        System.out.println("Balance with interest = " + newBalance);
        
        
        
        
    }
}