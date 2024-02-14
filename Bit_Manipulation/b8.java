package Bit_Manipulation;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class b8 {
    public static boolean isValid(String s) {
        Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "347873923408";
        if (isValid(s)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}