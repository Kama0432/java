

import java.util.*; 

public class conditional{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        

    System.out.println("Enter your age:");
    int age = sc.nextInt();
    
    if(age>=18)

    {                                                        
      System.out.println("adult");
    }
    else{
      System.out.println("not adult");
    }
     
    System.out.println("enter two number:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a==b)
    {
      System.out.println("equal");
    }
    else if(a>b)
    {
      System.out.println("a is greater");
    }
     else {
      System.out.println("b is greater");
     }

  }
}
