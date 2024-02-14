package Recursion;
//write a function to find a first occurence of an element in am array
public class r6 {
    public static int FirstOccurence(int arr[], int key, int i){
            if (i == arr.length){
                return -1;
            }
            if (arr[i]==key){
                return i ;
            }
            return FirstOccurence(arr,key,i+1);
        }
    public static void main(String[] args) {
        int key = 0;
        int arr[]={1,2,3,4,5,6,7,8,9,5};
        System.out.println(FirstOccurence(arr, 5, 0));
    }
    
}
