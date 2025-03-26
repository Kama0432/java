
import java.util.*;

public class calculator {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("enter 1 for Add two number");
     System.out.println("enter 2 for Substract two number");
     System.out.println("enter 3 for Multiply two number");
     System.out.println("enter 4 for Devision");

      int button = sc.nextInt();

      switch(button){
      
             case 1: 
                     System.out.println("enter two number:");
                     int a = sc.nextInt();
                     int b = sc.nextInt();
                     int c = a+b;
                     System.out.println("sum is:" +c);
                     break;
             
            case 2: 
            System.out.println("enter two number:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sub = num1-num2;
            System.out.println("sub is:" +sub);
            break;
            
           case 3:
           System.out.println("enter two number:");
           int n1= sc.nextInt();
           int n2= sc.nextInt();
           int mul= n1*n2;
           System.out.println("mul is:" +mul);
           break;
          
          case 4: 
          System.out.println("enter two number:");
          int d1 = sc.nextInt();
          int d2 = sc.nextInt();
          int d = d1/d2;
          System.out.println("sum is:" +d);
          break;

          default:
               System.out.println("default input");
                      
                    
        }

   }

}
    

