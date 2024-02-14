// Ques : For a given Strinf comvert each the First letter of each word to uppercase.
// hi, i am aman

// this ques also came in interview
package Strings;

public class s10 {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i< str.length()-1){
                sb.append(str.charAt(i));
                i++ ;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am aman";
        System.out.println(toUpperCase(str));
    }
    
}
