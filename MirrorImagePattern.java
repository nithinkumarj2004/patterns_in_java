import java.util.Scanner;

public class MirrorImagePattern {
    public static void main(String[] args) {
        int i, j, k, l, n;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows to print: ");
        n = scanner.nextInt();
        
        for (i = -n; i <= n; i++) {
            if (i < 0) {
                l = -i;
            } else {
                l = i;
            }
            
            for (j = 0; j <= n - l; j++) {
                System.out.print(" ");
            }
            
            for (k = 0; k < l + 1; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
