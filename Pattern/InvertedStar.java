public class InvertedStar {
    public static void main(String args[]) {
        int n=4;
        for (int line = 1;line<=n;line++){
            //one line
            for (int star=1;star<=(n-line+1);star++){
                System.out.print("*");
                // print is used instead of println so star cant go to next line.
            }
              System.out.println();
        }
        
            }
}


