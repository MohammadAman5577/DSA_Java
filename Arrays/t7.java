// Reverse an array
package Arrays;

public class t7 {
    public static void Reverse(int numbers[]){
        int first =0; 
        int last = numbers.length-1;
        while(first < last){ // less than ke baad = isliye nahi aata kyouki same number ko exchange karne ka KYA FAAYDA
            //code for swapping
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++; // first ek iddex aage aayega
            last --; // Last ek index peeche aayega   
        }
    }
    public static void main (String args[]){
            int numbers[]={1,2,5,6,7};

            Reverse(numbers);
            //print array
            for (int i=0; i<numbers.length;i++){
                System.out.print(numbers[i]+ " ");
            }
            System.out.println();
        

    }
    
}
