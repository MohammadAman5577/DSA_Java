// Inbuilt Sort -in reverse order

package Basic_Sorting_Algorithm;
import java.util.Arrays;
import java.util.Collections;

public class a5{
    public static void insertionSort(Integer arr[]){
        for(int i =1;i<arr.length;i++){
            int curr=arr[i];
            int prev =i -1;

            
            while(prev >=0 && arr[prev] > curr ){
                arr[prev+1]= arr[prev];
                prev --;

            } 
            // insertion
            arr[prev+1]= curr;
                
        }

    }
    public static void printArr(Integer arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
            System.out.println();
    }
    public static void main(String args []){
        Integer arr[]= {5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
    
}
// We have to change int to Integer because our reverse order function only works on objects
// int is primitive type
// This array is an object of integer class ; ie Integer arr[]= {5,4,1,3,2};