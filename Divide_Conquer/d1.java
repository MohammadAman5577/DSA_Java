package Divide_Conquer;

// Merge Sort usiing recursion

public class d1 {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){ // si and ei is starting and ending index
        // base case
        if(si >= ei){
            return;
        }
        // kaam
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid); // left side 
        mergeSort(arr, mid+1, ei); // right side 
        merge(arr, si, mid, ei);
    }
public static void merge(int arr[], int si, int mid, int ei){
    //temp array
    // left (0,3)ie 4 elements and right (4,6)ie 3 elements
    //so total elements =6-0+1=7
    int temp[]=new int[ei-si+1];

    int i= si; // iterator for ledt side
    int j= mid+1; // iterator for right side
    int k=0; // iterator for temp

    while (i<=mid && j<=ei) {
        if(arr[i]< arr[j]){
            temp[k]=arr[i];
            i++; 
        }
        else{
            temp[k]=arr[j];
            j++; 
        }
        k++;
    }

    // ye uske liye likh rha hu ki agar kabhi left part me kuch bach gaya ya right part me kuch bach gaya
    // matlab isse pahle and condition thi na , isluye agar dono satisfy hone chaiyea tha 
    
    while(i<=mid){
        temp[k++]=arr[i++]; // left side ka array
    }
    while(j<=ei){
        temp[k++]=arr[j++]; // left side ke liye
    }
    // copy temp to original array
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i]=temp[k];
    }
}

    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1); // calling function
        printArr(arr);
    }    
}
