//Nicole Weber
//CSE 002
//Lab 07

//import the scanner
import java.util.Scanner;

//define a class
public class methods {
    
    //add a main method
    public static void main (String[] args) {

        //call the scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        //give user instructions
        System.out.println("Enter 10 integers in ascending order to find the mean and the median.");

        //prompt user for input for an integer
        System.out.print("Enter integer 1: ");
        
        //allow user to enter input for an integer
        int int1 = myScanner.nextInt();
        
        
        //prompt user for input for an integer
        System.out.print("Enter integer 2: ");
        
        //allow user to enter input for an integer
        int int2 = myScanner.nextInt();
        
        //prompt user for input for an integer
        System.out.print("Enter integer 3: ");
        
        //allow user to enter input for an integer
        int int3 = myScanner.nextInt();
        
        //prompt user for input for an integer
        System.out.print("Enter integer 4: ");
        
        //allow user to enter input for an integer
        int int4 = myScanner.nextInt();
        
        //prompt user for input for an integer
        System.out.print("Enter integer 5: ");
        
        //allow user to enter input for an integer
        int int5 = myScanner.nextInt();
        
        //prompt user for input for an integer
        System.out.print("Enter integer 6: ");
        
        //allow user to enter input for an integer
        int int6 = myScanner.nextInt();
        
        //prompt user for input for an integer
        System.out.print("Enter integer 7: ");
        
        //allow user to enter input for an integer
        int int7 = myScanner.nextInt();
        
        //prompt user for input for an integer
        System.out.print("Enter integer 8: ");
        
        //allow user to enter input for an integer
        int int8 = myScanner.nextInt();
        
        //prompt user for input for an integer
        System.out.print("Enter integer 9: ");
        
        //allow user to enter input for an integer
        int int9 = myScanner.nextInt();
        
        //prompt user for input for an integer
        System.out.print("Enter integer 10: ");
        
        //allow user to enter input for an integer
        int int10 = myScanner.nextInt();
        
        double x;
        x = mean(int1, int2, int3, int4, int5, int6, int7, int8, int9, int10);
        System.out.println("Mean = " + x);
        
        double y;
        y = median(int5, int6);
        System.out.println("Median = " + y);

        
        }
        //add a method to calculate the mean
        public static double mean(int int1, int int2, int int3, int int4, int int5, int int6, int int7, int int8, int int9, int int10) {
            
            double mean = (int1+int2+int3+int4+int5+int6+int7+int8+int9+int10)/10;
            return mean;
            
        }
        
        
        //add a method to calculate the median
        public static double median(int int5, int int6){

            double median = (int5+int6)/2;
            return median;
            
            }
    

}