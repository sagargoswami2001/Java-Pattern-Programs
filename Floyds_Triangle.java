public class Floyds_Triangle {
    public static void main(String[] args) {
        
        int n = 5;
        int num = 1;

        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // Number = Number + 1
            }
            System.out.println();
        }
    }
}
