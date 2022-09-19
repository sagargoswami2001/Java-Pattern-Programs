public class Inverted_Half_Pyramid_180_Deg {
    public static void main(String[] args) {
        
        int n = 4;

        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop -> Space Print
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // Inner Loop -> Print Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
