public class Pascals_Triangle {
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        
        int n = 4;
        Pascals_Triangle g = new Pascals_Triangle();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                
                // For Left Spacing
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                
                // nCr Formula
                System.out.print(" " + g.factorial(i) / (g.factorial(i - j) * g.factorial(j)));
            }

            System.out.println();
        }
    }
}
