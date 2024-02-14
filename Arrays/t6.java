// BINARY SEARCH

package Arrays;

public class t6 {
    public static int BinarySearch(int numbers[],int key){
        int start=0;
        int end =numbers.length-1;
    while(start<=end){
        int mid =(start+end)/2;
        
        //comparison
        if(numbers[mid] == key){
            return mid; // ye batata hai ki is index pe humari key exist karti hai
        }
        if(numbers[mid]<key) { // Right side
        start = mid+1;
        }   else{
        end = mid -1;
        }
    }

    return -1;
}
    public static void main(String args[]){
        int numbers[]={1,2,3,4,10,23};
        int key =25;
        System.out.println("Index for key is: "+ BinarySearch(numbers, key));

    }   
}
