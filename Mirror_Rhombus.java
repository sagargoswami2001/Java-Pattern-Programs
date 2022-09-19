public class Mirror_Rhombus {
    public static void main(String[] args) {
        
        // Number of Rows
        int n = 5;

        for (int i = 1; i <= n; i++) {
            
            // Print Space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print Star 'n' Times
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // System.out.print(System.lineSeparator());
            System.out.println();
        }
    }
}
