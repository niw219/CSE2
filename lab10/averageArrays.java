//Nicole Weber
//CSE 002
//Lab 10

import java.util.Scanner;

public class averageArrays {
    
 int[] array = new int[10];
        int i = 0;
        while(i<array.length){
            if(i%2==0){
                array[i]=i*2;
            }
            System.out.print(array[i]+" ");
            i++;
        } 

    }
    
}