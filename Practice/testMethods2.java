public class testMethods2 {
    
    public static int add2(int x) {
        x=x+2;
        System.out.println("during i = " + x);
        return x;
    }
    
    public static double divideBy3(double y) {
        
        y=y/3;
        return y;
    }
    
    public static void main(String[] args) {
        
        double i =9;
        System.out.println("before i = " + i);
        i=divideBy3(i);
        System.out.println("after i = " + i);
        
    }
}