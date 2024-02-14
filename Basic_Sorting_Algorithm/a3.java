// Insertion Sort
package Basic_Sorting_Algorithm;

public class a3 {
    public static void insertionSort(int arr[]){
        for(int i =1;i<arr.length;i++){
            int curr=arr[i];
            int prev =i -1;

            // previous element jab tak aage wale element se bade 
            //hai tab tak hume unshe peeche shift karna hai
            
            //Finding out the correct posituon to insert
            while(prev >=0 && arr[prev] > curr ){
                arr[prev+1]= arr[prev];
                prev --;

            } 
            // insertion
            arr[prev+1]= curr;
                
        }

    }
    public static void printArr(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
            System.out.println();
    }
    public static void main(String args []){
        int arr[]= {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
    
}
