public class Solid_Rhombus {
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
