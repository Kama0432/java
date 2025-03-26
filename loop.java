import java.util.*;

public class loop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
                            
          //Program for print 0 to n numbers(for loop)

      /* System.out.print("Enter the number:");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++)
        {
         System.out.println(i);
        }
      */
         
      //program to print n to 0 numbers (while loop)
         
      /* 
         System.out.print("Enter the number:");
         int n = sc.nextInt();
       
         while(n>=0)  
          {
            System.out.println(n);
             n--;
          }
       */
          
         // program for print 0 to n number (do while)
         
         System.out.print("enter number:");
         int n = sc.nextInt();
         int i=0;
         do { 
            System.out.println(i);
            i++;
         } while (i<=n);



    }
    
}
