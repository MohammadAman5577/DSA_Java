// print subarrays
package Arrays;

public class t9 {
    public static void printSubarrays(int numbers[]){
        int totalSubarrays=0;
        for(int i=0;i<numbers.length;i++){
            
            int start=i;
            for(int j=i; j<numbers.length;j++){ // j=i isliye likha gaya hai kyouki hum single wale element ko bhi print kar sake
                int end =j;
                for (int k =start;k<=end ;k++){ // print
                    System.out.print(numbers[k]+" ");// subarray
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays " + totalSubarrays);
    }
    public static void main(String args []){
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        printSubarrays(numbers);
    }
    
}

