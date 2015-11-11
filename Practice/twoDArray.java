public class twoDArray {
    
    public static void main (String [] args) {
        
        int [] [] arr;
        arr = new int [5] [5];
        
        for (int i=0; i<5; i++) {
            
            for (int j=0; j<5; j++) {
                
                if ((i + j)%2 == 0 ) {
                    arr[i][j] = i+j;
                }
                else {
                    arr[i][j] = -1;
                }
            }
            

            
        }
        
        for (int i=0; i < 5; i++) {
            
            for (int j=0; j<5; j++) {
                
                System.out.print(arr[i][j] + "\t");
                
            }
            

            
        }
                   System.out.println("arr[3][3]= " + arr[3][3]); 
    }
    
    
}