//Nicole Weber
//CSE 002
//Lab 11

//define a class
public class arrays {
    
    //add a main method
    public static void main (String[] args) {
        
        //declare first array
        int [] array1 = new int [20];
        
        //add data to the array
        for (int i=0; i<20; i++) {
            
            array1[i]=(int)(Math.random() * 100);
            
        }
        
        //print values in first array
        System.out.print("Array 1 = ");
        for (int j=0; j<20; j++) {
        
            System.out.print(array1[j] + " ");
            
        }
        
        System.out.println("");
        
        //declare second array
        int [] array2 = new int [10];
        
        //add values to the second array and print values in second array
        System.out.print("Array 2 = ");
        for (int k=0; k<10; k++) {
            array2[k]=(int)(Math.random() * 100);
            System.out.print(array2[k] + " ");
        }
        
        System.out.println("");
        
        //call sort method to sort first and second arrays
        sort(array1);
        sort(array2); 
        
        //declare third array
        int [] array3 = new int [30];
        
        //add values to third array
        for(int n=0; n<20; n++) {
            array3[n]=array1[n];
        }
        //add values to third array
        for(int p=0; p<10; p++) {
            array3[20+p]=array2[p];   
            
        }
        
        //sort third array
        sort(array3);
        
        //print values in third array
        System.out.print("Array 3 = ");
        for (int m=0; m<30; m++) {
            System.out.print(array3[m]+" ");
        }
    }
    
    //add sort method
    public static void sort (int [] array1) {
        
        int temp=0;
        
        //loop to sort data
        for (int i=0; i<array1.length; i++) {
            
            for (int j=0; j<array1.length-1; j++) {

            if(array1[j+1]<array1[j]) {
                    
                    temp=array1[j+1];
                    array1[j+1]=array1[j];
                    array1[j]=temp;
                    
            }
                
            }
            
        }

    }
    
}