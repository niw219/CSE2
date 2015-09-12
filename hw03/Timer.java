//This imports the scanner to the program.
import java.util.Scanner;

//define a class
public class Timer {

//add a main method
public static void main(String[]args){
    
    //call the Scanner constructor
    Scanner myScanner = new Scanner ( System.in );
   
    //prompt user for current time
    System.out.print("Enter the current time: ");
    
    //call a method for the scanner to accept user input for the time
    int currentTime = myScanner.nextInt();
    
    //prompt user for time of dinner
    System.out.print("Enter the time that you will be eating dinner: ");
    
    //call a method for the scanner to accept user input for the time you will be eating dinner
    int dinnerTime = myScanner.nextInt();
    
    int timeInBetween = (dinnerTime - currentTime);
    int hours = timeInBetween/100;
    int minutes = (timeInBetween%100);
    
    System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
    
    
    
}

}