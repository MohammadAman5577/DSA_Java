// Operations on Bit
// 1. Get ith Bit
// 2. Set ith bit
// 3. Clear ith bit
// 4. Update ith bit
package Bit_Manipulation;

public class b5 {
    //1
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & 1<<i)==0){
            return 0;
        }
        else {
            return 1;
        }
    }
    //2
     public static int setIthBit(int n, int i){
            int bitMask = 1<<i;
            return n | bitMask;
        }

    //3 
    public static int clearIthBit(int n , int i)    {
          int bitMask =~(1<<i);
          return n & ~(1<<i);
    }
    //4
    public static int updateIthBit(int n,int i, int newBit){
       // easier code - Method 1
        // if(newBit == 0){
        //     return clearIthBit(n,i);
        // }else{
        //     return setIthBit(n, i);
        // }

        //method -2 
        n = clearIthBit(n, i);
        int bitMask= newBit<<i;
        return n | bitMask;

    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));

        System.out.println(setIthBit(10, 2));
    
        System.out.println(clearIthBit(10,2));

        System.out.println(updateIthBit(10,2, 1));
    }
    
}
