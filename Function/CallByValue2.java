package Function;
public class CallByValue2 {

    public static void Swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
       
    }
    public static void main (String args[]){
        int a= 5;
        int b=10;
        Swap(a,b);
        System.out.println("a is " + a);
        System.out.println("b is " + b);

    }
    
}//Here a  and b are showing their there initial value which was there in the main function.
//the passed value of function will not go to main function during execution
