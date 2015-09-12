//This imports the scanner to the program.
import java.util.Scanner;

//define a class
public class Block {

//add a main method
public static void main(String[]args){
    
    //call the Scanner constructor
    Scanner myScanner = new Scanner ( System.in );
    
    //prompt user for length of block
    System.out.print("Enter the length of the block: ");
    
    //call a method for the scanner to accept user input for the length
    double length = myScanner.nextDouble();
    
    //prompt user for width of block
    System.out.print("Enter the width of the block: ");
    
    //call a method for the scanner to accept user input for the width
    double width = myScanner.nextDouble();
    
    //prompt user for height of block
    System.out.print("Enter the height of the block: ");
    
    //call a method for the scanner to accept user input for the height
    double height = myScanner.nextDouble();
    
    double volume = length*width*height;
    double surfaceArea = 2*(length*width) + 2*(width*height) + 2*(length*height);
    
    System.out.println("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume + ".");
    System.out.println("The surface area of the block is " + surfaceArea);
    
}

}