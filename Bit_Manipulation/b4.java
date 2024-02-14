// Check odd or even 

package Bit_Manipulation;

public class b4 {
    public static void oddOrEven(int n){
        int bitMask =1;
        if((n & bitMask)== 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven(33);        
        oddOrEven(2);        
        oddOrEven(3);        

    }    
}
