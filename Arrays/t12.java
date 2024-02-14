// Max Subarray Sum - Kadane's Method
// TC is O(n)

package Arrays;

public class t12 {
    public static void Kadanes(int numbers[]){
        int maxSum= Integer.MIN_VALUE;
        int currSum= 0;
        for (int i=0; i<numbers.length;i++){
            currSum = currSum + numbers[i];
            if (currSum<0){
               currSum =0;
            } 
             maxSum= Math.max(currSum,maxSum);

        }
        System.out.println("Our max subarray sum is: "+ maxSum);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(numbers);
    }
    
}
