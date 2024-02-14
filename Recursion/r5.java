package Recursion;

//sorting in array first we are comparing staring 2 numbers
//and for after part we will use recursive call to check wheter it is sorted or not
// pairs me check karenge

public class r5 {
    public static boolean isSorted(int arr[], int i){
    // i is the starting point from where we will start comparing   
        if (i==arr.length-1){// base condition

            // since last element is always graeatest as it is sorted 
            return true;
        }
        
        if (arr[i]> arr[i+1]){
            return false ;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(isSorted(arr, 0));
    }
}
