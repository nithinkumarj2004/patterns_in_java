import java.util.Scanner;

public class LeftArrowPattern {
    
 /*
 
* * * * * 
* * * *
* * *
* * 
*
* *
* * *
* * * *
* * * * * 

*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n= scanner.nextInt();
        int l;
        for (int i = -n;i <= n;i++) {
           if(i<0){
               l=-i;
           }else{
               l = i;
           }
            for(int j = 0; j < l+1 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
