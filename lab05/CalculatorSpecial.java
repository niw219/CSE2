//Nicole Weber
//CSE 002
//Lab 5

//This program will prompt the user for two integers, "a" and "b", as well as an operator, and will serve as
//a calculator for the user.  The calculator will continually prompt the user for input until they reply
//"n" or "N" to stop

//import scanner
import java.util.Scanner;

//define a class
public class CalculatorSpecial {
    
    //add a main method
    public static void main(String [] args) {
        
        //call the scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
                    
                    boolean Y=true;

                    
                    while(Y==true) {
                        
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
                    

            //prompt user to stop calculator
            System.out.print("Type n or N to stop.");
                    
            //call a method for the scanner to accept input to stop or continue the program
            String stop=myScanner.next();
            
                                
            if(stop.equals("n")) {
                Y=false;
                    }
            else if(stop.equals("N")) {
                Y=false;
            }
                    
             else {
                Y=true;
                    }
            
            
                    }
                        

    }//end of main method
    
}//end of public class