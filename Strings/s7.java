// for creating a SUBSTRING
package Strings;

public class s7 {
    public static void substring(String str, int si, int ei){
       // si and ei means starting index and ending index
       for(int i=si;i<ei;i++){
        System.out.print(str.charAt(i));
       } 
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        substring(str, 0, 5);

        // we can also use this function
        System.out.print(str.substring(0,5));
    }
}
