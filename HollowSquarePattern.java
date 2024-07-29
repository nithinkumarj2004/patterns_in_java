import java.util.Scanner;

public class HollowSquarePattern {
    
 /*
 
* * * * * 
*       * 
*       * 
*       * 
* * * * * 

*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n= scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
           
            for (int j = 1; j <= n ;j++) {
              
                if (i == 1 || i == n|| j == 1 || j == n {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for the hollow effect
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
        
        scanner.close();
    }
}
import java.util.Scanner;

public class HollowSquarePattern {
    
 /*
 
* * * * * 
*       * 
*       * 
*       * 
* * * * * 

*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n= scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
           
            for (int j = 1; j <= n ;j++) {
              
                if (i == 1 || i == n|| j == 1 || j == n {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for the hollow effect
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
        
        scanner.close();
    }
}
