// String comparison 
package Strings;

public class s6 {
    public static void main(String[] args) {
        String s1= "Tony";
        String s2= "Tony";
        String s3= new String("Tony");
        

        // here s1 and s2 are Pointing to same Tony which is stored in memory
        // but in s3 new keyword is  used so a NEW Tony is formed
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("not equal");
        }
    
        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("not equal");
        }

        if(s1.equals(s3)){
            System.out.println("EQUAL");
        }
        else{
            System.out.println("NOT EQUAL");
        }
    }
    
}
