//Nicole Weber
//CSE 002
//HW 08

import java.util.Scanner; 

public class areas {
    
    public static double area(int radius) {
        
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
        return area;
        
    }
    
    public static int area(int length, int width) {
        
        int area = length * width;
        System.out.println("Area = " + area);
        return area;
        
    }
    
    public static double area(int height, int base1, int base2) {
        
        double area = 0.5 * height * (base1 + base2);
        System.out.println("Area = " + area);
        return area;
        
    }
    
    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        while (true) {
        System.out.print("Enter a number corresponding to desired shape: 1=circle; 2=rectangle; 3=trapezoid; 4=exit: ");
        int shape = myScanner.nextInt();
        
        if (shape==1) {
            System.out.print("Enter radius: ");
            int radius = myScanner.nextInt();
            area(radius);
        }
        
        else if (shape==2) {
            System.out.print("Enter length: ");
            int length = myScanner.nextInt();
            System.out.print("Enter width: ");
            int width = myScanner.nextInt();
            area(length, width);
        }
        
        else if (shape==3) {
            System.out.print("Enter base 1: ");
            int base1 = myScanner.nextInt();
            System.out.print("Enter base 2: ");
            int base2 = myScanner.nextInt();
            System.out.print("Enter height: ");
            int height = myScanner.nextInt();
            area(base1, base2, height);
            
        }
        
        else if (shape==4) {
            break;
        }
}
        
        
    }
    
    }
    
    
    
