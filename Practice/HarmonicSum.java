public class HarmonicSum {
    
    public static void main(String[]args) {
        
        double n=1;
        
        double sum1 = 0;
        
        double sum2 = 0;
        
        while (n<=5000) {
        
        sum1+=(1/n);
        n++;
        }
        
        System.out.println(sum1);
        
        while(n>=1) {
            sum2+=(1/n);
            n--;
        }
        System.out.println(sum2);
        
        
    }
}