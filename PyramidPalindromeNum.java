import java.util.Scanner;

public class PyramidPalindromeNum {
    
 /*
    1
   121
  12321
 1234321


*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n= scanner.nextInt();
       for(int i = 0 ;i<n ; i++)
       {
           for(int j=0;j<n-i-1;j++)
           System.out.print(" ");
           for(int k=0;k<i;k++)
           System.out.print(+(k+1));
           for(int r=i;r>=0;r--)
           System.out.print(r+1);
            System.out.println();
        }
        
        scanner.close();
    }
}
