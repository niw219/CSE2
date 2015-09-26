//////////////////////////////////////////////////////////////
//Nicole Weber
//CSE 002
//Lab 4

//import the scanner to the program
import java.util.Scanner;

//define a class
public class Calculator {
    
    //add a main method
    public static void main(String[] args) {
        
        //call the scanner constructor
        Scanner myScanner = new Scanner (System.in);
        

        
        //prompt user for integer a
        System.out.print("Enter first integer (a): ");
        
        //call a method for the scanner to accept input for integer a
        int intA = myScanner.nextInt();
     
            //prompt user for integer b
            System.out.print("Enter second integer (b): ");
            
            //call a method for the scanner to accept input for integer b
            int intB = myScanner.nextInt();
            

                //prompt user to enter an operator
                System.out.print("Enter an operator ('+', '-', '*' , '/' ): ");
                
                //call a method for the scanner to accept input for an operator
                String operator = myScanner.next();

                    switch(operator) {
                    
                    case "+":
                    double answer1=intA+intB;
                    System.out.println("a + b = " + answer1);
                    break;
                    
                    case "-":
                    double answer2=intA-intB;
                    System.out.println("a - b = " + answer2);
                    break;
                    
                    case "*":
                    double answer3=intA*intB;
                    System.out.println("a * b = " + answer3);
                    break;
                    
                    case "/": 
                    double answer4=intA/intB;
                    System.out.println("a / b = " + answer4);
                    break; 
                    
                    default:
                    System.out.println("Illegal Operator");
                    break;
                    
                    }//end of switch
                    
   
    }
    //end of main method
}
//end of public class