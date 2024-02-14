// String Builder

//   sb.append() naam ka function hota hai  jo string builder me jo string hai uske peeche character ko joadne ke liye   

// TC is O(26)

// but if we havce taken string as data structure then TC will be O(26*26)
package Strings;

public class s9 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("  ");
        for (char ch ='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        // sb string ko print
    }
}
