// To find the largest of the nnumbers in Arrray
// we compare the value with -infinity and save it in some variable if the saved value is smaller then the next no ,we update it

//LINEAR SEARCH

//we can also get the smallest no  similarly

package Arrays;
import java.util.*;
public class t5 {
    public static int LargestNumber(int numbers[]){
        int Largest= Integer.MIN_VALUE; //isme largest no store hogs after running the loop
        int Smallest= Integer.MAX_VALUE; //isme smallest no store hogs after running the loop 
        for(int i=0;i<numbers.length;i++){
            if(Largest < numbers[i]){
                Largest = numbers[i];
            }
            if (Smallest > numbers[i]){
                Smallest = numbers[i];
            }
        } 
         System.out.println("The smallest no is :"+ Smallest);
        return Largest;
    }
    public static void main (String args[]){
        int numbers []= {1,2,4,6,7,79,44,0};
        System.out.println("The largest number is:"+ LargestNumber(numbers));

    }

    
}
