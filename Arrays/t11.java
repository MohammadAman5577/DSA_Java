// Max Subarray SUM- Prefix Array Method

package Arrays;

public class t11 {
    public static void maxSubarraySum(int numbers[]){
        int currSum = 0 ;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length]; // prefix array banaya aur uska size rakha prefix ke length ke jitna
        
        prefix[0]=numbers[0];
        // calculate prefix array
        for(int i=0; i<prefix.length;i++){
            prefix[i] =  prefix[i-1] + numbers[i] ;// pahle wale saare elements ka sum aur current element ka sum
        }

        for(int i=0;i<numbers.length;i++){
            
            int start=i;
            for(int j=i; j<numbers.length;j++){
                int end =j;
                currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1]; /*if start ki value 0 hui to us case me humne condition laga di ki agar start ==0 hai to currSum ban jaayega directly  prefix[end]*/
            
                if (maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
           
        }
        System.out.println("max sum = :"+ maxSum);
     
    }
    public static void main(String args []){
        int numbers[]={1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
    
}
