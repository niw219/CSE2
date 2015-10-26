//Nicole Weber
//CSE 002
//Lab 7

//This program will create pyramids of sizes based on user input

//import the scanner
import java.util.Scanner;

//define a class
public class encrypted_x {
    
    //add a main method
    public static void main(String[]args) {
        
        //call the scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        //prompt user for size of x
        System.out.print("Enter an integer between 1 and 100: ");
        
        //call a method to accept user input for the integer
        int input = myScanner.nextInt();
        
        if (input>=1 && input<=100) {
            
            for(int line=0; line<=input; line++) {
                
                for(int n=0; n<=input; n++) {
                    
                    boolean y;
                    
                    if(n==line) {
                        
                        y=true;
                        
                    }
                    
                    else if (n==input - line) {
                        
                       y=true;
                        
                    }
                    
                    else {
                        
                        y=false;
                        
                    }
                    
                    if(y==true) {
                        
                        System.out.print(" ");
                        
                    }
                    
                    else {
                        
                        System.out.print("*");
                        
                    }
                    
                }
                
               System.out.println(); 
            
        }
        
        }
        
        else {
            System.exit(-1);
        }
        
}

}