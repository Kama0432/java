import java.util.*;
public class table {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number:");   
     int n = sc.nextInt();
     int t=0;
     for(int i=1; i<=10; i++)
      {
        t=i*n;
        System.out.println(t);
      }
       

   }   
}
