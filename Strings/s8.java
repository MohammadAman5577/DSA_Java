// largest of string  
package Strings;

public class s8 {
    public static void main(String[] args) {
        String fruits []= { "Apple" , "Banana", "mango"};
        
        String largest = fruits[0];
    
        for(int i=1; i<fruits.length; i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }   

    
}
