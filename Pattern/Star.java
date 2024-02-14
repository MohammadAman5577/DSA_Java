public class Star {
    public static void main(String args[]) {
        for (int line = 1;line<=100;line++){
            //one line
            for (int star=1;star<=line;star++){
                System.out.print("*");
                // print is used instead of println so star cant go to next line.
            }
              System.out.println();
        }
        
            }
}
