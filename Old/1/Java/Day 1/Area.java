import java.util.*;

public class Area{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
   /*      
   Area of two numbers
         int a = sc.nextInt();
         int b = sc.nextInt();

         int product = a*b;

         System.out.println(product);
         System.out.println(a*b);
    */

         // Area of circle
         System.out.println("Enter the radius of circle ");
         float rad = sc.nextFloat();
         float area = 3.14f * rad * rad;

         System.out.println(area);

    }
}