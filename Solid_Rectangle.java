// Solid Rectangle
public class Solid_Rectangle
{
    public static void main(String[] args) 
    {
        int n = 4;
        int m = 5;

        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
