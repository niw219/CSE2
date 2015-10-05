//Nicole Weber
//CSE 002
//Lab 6

//This program will calculate the total payroll for a given number of employees

//import the scanner
import java.util.Scanner;

//define a class
public class timeSheets {
    
    //add a main method
    public static void main(String[]args) {
        
        //call the scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        //prompt the user for the number of employees they want to enter information for
        System.out.print("Enter a non-negative integer specifying the number of employee timesheets to be read in: ");
        
        //call a method for the scanner to accept input
        int employees = myScanner.nextInt();
        
        int loops = 0;
        
        int payroll = 0;
        
        while(loops<employees) {
            
            //prompt user for the employee pay in cents
            System.out.print("Enter employee's pay (in cents): ");
            
            //call a method for the scanner to accept input for employee pay
            int pay = myScanner.nextInt();
            
            
            //prompt the user for the number of hours the employee works on Monday
            System.out.print("Enter number of hours that employee worked on Monday: ");
            
            //call a method for the scanner to accept input for Monday hours
            int monday = myScanner.nextInt();
             
            //prompt the user for the number of hours the employee works on Tuesday
            System.out.print("Enter number of hours that employee worked on Tuesday: ");
            
            //call a method for the scanner to accept input for Tuesday hours
            int tuesday = myScanner.nextInt();
             
            //prompt the user for the number of hours the employee works on Wednesday
            System.out.print("Enter number of hours that employee worked on Wednesday: ");
            
            //call a method for the scanner to accept input for Wednesday hours
            int wednesday = myScanner.nextInt();
             
            //prompt the user for the number of hours the employee works on Thursday
            System.out.print("Enter number of hours that employee worked on Thursday: ");
            
            //call a method for the scanner to accept input for Thursday hours
            int thursday = myScanner.nextInt();
             
            //prompt the user for the number of hours the employee works on Friday
            System.out.print("Enter number of hours that employee worked on Friday: ");
            
            //call a method for the scanner to accept input for Friday hours
            int friday = myScanner.nextInt();
            
            payroll = payroll + (monday + tuesday + wednesday + thursday + friday) * pay;
            
            loops++;
        
        }
        
        
        
            System.out.println("Total payroll in cents = " + payroll);
        
    }
}