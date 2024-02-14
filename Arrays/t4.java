// Linear Search in array
// we are finding at which index, key=(10) is stored in array

package Arrays;
public class t4 {
    public static int LinearSearch(int numbers[],int key){
        for(int i=0;i<=numbers.length;i++){
            if(key==numbers[i]){
                return i;
            }else{
                return -1;
            }
           
        }
        return -1;
        
         
    } 

    public static void main (String args[]){
        int numbers []={2,4,6,8,10,12,14,16};
        int key = 20;
        // index ko return karne ke liye
        int index = LinearSearch ( numbers, key) ;
        if (index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("index is at :"+ index);
        }

    } 
        
        
}



