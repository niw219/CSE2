//Nicole Weber
//CSE 002
//HW 05

//This program will calculate the average of the grades
//that the user inputs.

//import scanner
import java.util.Scanner;

//define a class
public class AverageGrade {
    
    //add a main method
    public static void main(String[] args) {
        
        //call the scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        boolean y=true;
        
        int gradeCount=0;
        int gradeSum=0;
        double gradeAverage;
        
        while (y=true) {
            
            //prompt user to enter a grade
            System.out.print("Enter a grade (or enter 999 to calculate average): ");
            
            //call a method for the scanner to accept input for the grade
            int grade = myScanner.nextInt();
            
            gradeSum = gradeSum + grade;
            gradeCount = gradeCount + 1;
            
            if (grade==999) {
                y = false;
                gradeAverage=(gradeSum-999)/(gradeCount-1);
                System.out.println("Average grade = " + gradeAverage);
                break;
            }
            
            else if (grade>100 || grade<0) {
                y = false;
                System.out.println("Invalid grade entered.");
                
            }
            
            else {
                y=true;
            }
            
            
            
            
        }//end of while loop
    
    }//end of main method
}//end of public class