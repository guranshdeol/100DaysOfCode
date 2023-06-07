import java.util.*;

public class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // //while loop
        // int i = 1;
        // while(i<=10){
        //     System.out.println("Hello");
        //     i++;
        // }
// // print number from 1 to n
//         int a = sc.nextInt();
//         int n = 1;
//         while(n <=a  ){
//             System.out.print(n+ " ");
//             n++;
//         }
    //   // Sum of First n Natural Numbers.

    // int a = 1;
    // int n = sc.nextInt();
    // int sum = 0;

    // while (a <=n){
         
    //     sum += a;
    //     a++;
    // }
    // System.out.println(sum);

    //for loops

    // for(int i = 0; i<10;i++){
    //     System.out.println("Hello world!");
    // }
        // print 4 starts of 4 lines
    // for (int line = 1; line <=4; line++){
    // System.out.println("* * * *");
    // }

    // // print reverse of a number

    // int n = 10899;
    // for (int i = 0; i <5;i++){
    //     System.out.print(n%10);
    //     n /=10;
    // }

    //reverse the given number
    int n = 10899;
    int ld;
    
for (int i = 0 ; i <5;i++){

    ld = n % 10;
    n = n/10;
    int rev =0;
     rev = (rev *10) + ld;
System.out.println(rev);
}

System.out.println(rev);
    }
}