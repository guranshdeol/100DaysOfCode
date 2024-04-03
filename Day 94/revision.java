import java.util.*;

public class revision {
    public static void main(String[] args) {
        
    
    
    // int a = 10;
    // int b = 20;
    // if (a > b){
    //     System.out.println("a is the greatest number.");
    // }
    // else{
    //     System.out.println("b is the greatest number");
    // }
// Terneary opwrator
    // String s = (a>b)? "a is greatest": "b is greatest";
    // System.out.println(s);

    // while (b > a) {
    //     System.out.println("Hello World!");
    //     a++;
    //     System.out.println(a);
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int numb = 1;
    int sum = 0;
    while (numb <= n){
        sum = sum + numb;
    numb++;}

    System.out.println(sum);
    
    }
}
