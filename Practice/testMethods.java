public class testMethods {
    
    public static void hw() {
        System.out.println("Hello world!");
    }
    
    public static int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
    
    public static boolean isMult2(int a) {
        
        if(a%2==0) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public static void main(String[]args) {
        System.out.println("Hello" );
        hw();
        int x; 
        x=add(3,8);
        System.out.println("add = " + x);
        boolean i;
        i = isMult2(5);
        System.out.println(i);
    }
}

