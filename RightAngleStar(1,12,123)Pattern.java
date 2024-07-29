import java.util.Scanner;

public class RightAngleStarPattern {
/*
   1
   12
   123
   1234
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows to print: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(+(j+1));
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
