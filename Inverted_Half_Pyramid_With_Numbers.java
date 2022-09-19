public class Inverted_Half_Pyramid_With_Numbers {
    public static void main(String[] args) {

        int n = 5;
        
         //Outer Loop
        //  for (int i = n; i >= 1; i--) {          1st Method

         for (int i = 1; i <= n; i++) {             // 2nd Method
            // Inner Loop
            // for (int j = 1; j <= i; j++) {       1st Method

            for (int j = 1; j <= n-i+1; j++) {      // 2nd Method
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
