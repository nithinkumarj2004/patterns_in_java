import java.util.Scanner;

public class Pyramid {
    
 /*
     *
   * * *
  * * * * *
 * * * * * * *


*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n= scanner.nextInt();
       for(int i = 0 ;i<n ; i++)
       {
           for(int j=0;j<n-i-1;j++)
           System.out.print(" ");
           for(int k=0;k<i*2+1;k++)
           System.out.print(" *");
       
            System.out.println();
        }
        
        scanner.close();
    }
}
