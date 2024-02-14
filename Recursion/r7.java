package Recursion;
//write a function to find a 'LAST" occurence of an element in am array
public class r7 {
    public static int LastOccurence(int arr[], int key, int i){
            if (i == arr.length){
                return -1;
            }
            int isFound=LastOccurence(arr,key,i+1);
            if (isFound==-1 && arr[i]==key){
                return i ;
            }
            return isFound;
        }

    public static void main(String[] args) {
       // int key = 0;
        int arr[]={5,5,5,5};
        System.out.println(LastOccurence(arr, 5, 0));
    }
    
}
