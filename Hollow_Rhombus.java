public class Hollow_Rhombus {
    public static void main(String[] args) {
        
        // Number of Rows
        int n = 5;

        for (int i = 1; i <= n; i++) {
            
            // Print Space
            for (int j = i; j < n; j++) {
            // for (int j = 1; j < i; j++) {                   // Mirror of Hollow Rhombus
                System.out.print(' ');
            }

            for (int j = 1; j <= n; j++) {
                
                // Print '*' for Boundaries
                if ( i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(' ');
                }
            }

            // Move to the Next Row
            System.out.println();
        }
    }
}
