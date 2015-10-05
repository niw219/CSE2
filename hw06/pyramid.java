//Nicole Weber
//CSE 002
//Homework 6

//This program will create pyramids of sizes based on user input

//import the scanner
import java.util.Scanner;

//define a class
public class pyramid {
    
    //add a main method
    public static void main(String[]args) {
        
        //call the scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        //prompt user for size of pyramid
        System.out.print("What size pyramid? ");
        
        //allow user to enter input for pyramid size
        int size = myScanner.nextInt();
        
        int loops;
        
        int spaces;
        
        int rightStars;
        
        int leftStars;
        
        for (loops=0; loops<=size-1; loops++)  {
            
            for(spaces=size-1; spaces>=loops; spaces--) {
                System.out.print(" ");
            }//end of second for loop
                for(rightStars=1; rightStars<=loops; rightStars++) {
                    System.out.print("*");
                }//end of third for loop
                    
                    for(leftStars=0; leftStars<=loops; leftStars++) {
                        System.out.print("*");
                      
                    }//end of last for loop
                    
                    System.out.println();
                    
                    }//end of first for loop
        
    }// end of main method
    
}// end of class