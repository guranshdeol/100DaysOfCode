import java.util.*;

public class Revision{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= n-1; i++){
            if (n%i == 0){
                isPrime = false;
            }

        }

        if(isPrime == true){
            System.out.println("The given number is Prime");
        }
        else{
            System.out.println("The given number is  not Prime");
            
        }
    }
}