import java.util.Scanner;

public class coinFlip {

    public static void flip() {
    
    double randNum = (Math.random()*10);
    
    if(randNum<=4) {
        System.out.println("head: 1");
        System.out.println("tail: 0");
    }
    
    else {
        System.out.println("head: 0");
        System.out.println("tail: 1");
    }
    
    }
    
    public static String flip(int n) {
        
        int head=0;
        int tail=0;

        
        for(int i=1; i<=n; i++) {
            
        double randNum = (Math.random()*10);

        
        if(randNum<=4) {
            head++;
        }
        
        else {
            tail++;
        }

        }
        String headsTails = "head: " + head + "     " + "tail: " + tail;
        System.out.println(headsTails);        
        return headsTails;
        
    
    }
    
    public static void main(String[]args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        while (true) {
        System.out.print("Enter an integer between 0 and 100: ");
        
        int a = myScanner.nextInt();
        
        if (a==0) {
            flip();
        }
        
        else if (a>=1 && a<=100) {
            flip(a);
            
        }
        
        else {
            break;
        }
        
        }

    }

}