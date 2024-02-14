package Strings;

public class s3 {
    public static void printAllCharcter(String str){
        for(int i=0 ; i<str.length(); i++){
           System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String aman= "Anas";
        String Ashfa= "Asfa Fatima";
        String FullNAme = aman+ Ashfa ;
       
        printAllCharcter(FullNAme);
    }
}
