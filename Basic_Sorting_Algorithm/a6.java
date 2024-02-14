// Counting Sort
package Basic_Sorting_Algorithm;
import java.util.*;

public class a6 {
    public  static void countingSort(int array[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++){
            largest= Math.max(largest,array[i]);

        }

        int count[] = new int[largest+1]; //count ka size hone wala hai largest+1
        for(int i=0; i<array.length; i++){
            count[array[i]]++;  // no ko index ki tarah lena hai phir hume count pe jana hai aur use ++ kar dena hai
            // isme humne original array pe count kiya hai
        }
        //sorting
        int j=0;
        // isme humne frequency wale array me iterate karna hai
        for(int i=0; i<count.length; i++){
            while(count[i]> 0){
                array[j]= i;
                j++;
                count[i]--;
            }
        }
        }
        public static void printArr(int array[]){
            for (int i=0; i< array.length ; i++){
                System.out.print(array[i]+ " ");
            }
                System.out.println();
        }
    public static void main(String args[]){
        int array[]={1,4,1,3,2,4,3,7};
        countingSort(array);
        printArr(array);
    }
    
}
