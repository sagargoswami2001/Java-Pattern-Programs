public class Butterfly_Pattern {
    public static void main(String[] args) {
        
        int n = 5;

        // Upper Half
        for (int i = 1; i <= n; i++) {
            // Print First Part Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");                
            }
            
            // Spaces
            int spaces = 2 * (n-i);

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print Second Part Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {
            // Print First Part Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");                
            }
            
            // Spaces
            int spaces = 2 * (n-i);

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print Second Part Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
