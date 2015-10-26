public class testOverloading {
    
    public static void overload1(int x) {
        
        System.out.println("x = " + x)
        
    }
    
    public static void overload1(boolean x) {
        
        System.out.println("x = " + x)
        
    }
    
    public static void main (String[]args) {
        
        overload1(5);
        overload1(false);
    }
    
}