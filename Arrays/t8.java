// code to find pairs in array

package Arrays;

public class t8 {
    public static void printPairs(int numbers[]){
        int totalPairs=0;
        for (int i=0 ; i<numbers.length;i++){
            int curr= numbers[i];
            for (int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                totalPairs ++;    
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }
    public static void main(String args []){
        int numbers[]={1,2,3,5,7,8};
        printPairs(numbers);   
    }    
}
