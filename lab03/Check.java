//This program will calculate the cost for each person when a dinner check is split evenly.

//This imports the scanner to the program.
import java.util.Scanner;

//define a class
public class Check{
    
    //add a main method
    public static void main(String[]args){
        
        //call the Scanner constructor
        Scanner myScanner = new Scanner ( System.in );
        
        //prompt user for the original cost of the check
        System.out.print("Enter the original cost of the check in the form of xx.xx: ");
        
        //call a method for the scanner to accept user input for cost of check
        double checkCost = myScanner.nextDouble();
        
        //prompt the user for the tip percentage that they wish to pay
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        
        //call a method for the scanner to accept user input for the tip percentage they want to pay
        double tipPercent = myScanner.nextDouble();
        
        //convert the percentage to a decimal value
        tipPercent /=100;
        
        //prompt the user for the number of people that are splitting the check
        System.out.print("Enter the number of people who went out to dinner: ");
        
        //call a method for the scanner to accept user input for the number of people splitting the check
        int numPeople = myScanner.nextInt();
        
        
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for storing digits to the right of the decimal point for the cost
        totalCost = checkCost*(1 + tipPercent);
        costPerPerson = totalCost/numPeople;
        //get the whole amount, dropping decimal fraction
        dollars=(int)(costPerPerson);
        //get dimes amount, e.g.,
        //(int)(6.73*10)%10->67%10->7, where the % operator returns the remainder after division
        dimes=(int)(costPerPerson*10)%10;
        pennies=(int)(costPerPerson*100)%10;
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
        
    }
    //end of main method
}
//end of class