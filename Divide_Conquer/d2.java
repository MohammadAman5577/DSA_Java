package Divide_Conquer;

public class d2 {
    public static void printARr(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int si, int ei){
        if(si>=ei){
            return ;
        }
        //last element
        int pidx=partition(arr,si,ei); // partitiion function pivot ka index dega
        quickSort(arr, si, pidx-1);   // left part
        quickSort(arr, pidx+1, ei);   // right part
    }
    public static int partition(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i = si-1;   // to make place for elements smaller than pivot
        
        for (int j=si; j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];   // pivot =arr[i] nhi likhna  since pivot is variable not array        arr[i]=temp;
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printARr(arr);
    }
}
