import java.util.*;

public class Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age >=18){
        //     System.out.println("Eligible for Driving");
        // }
        // else{
        //     System.out.println("Ineligible for driving");
        // }
        
        int position = sc.nextInt();

        switch(position) {
            case 1: 
            System.out.println("You won first position");
            break;
            case 2: 
            System.out.println("You won second position");
            break;
            case 3: 
            System.out.println("You won third position");
            break;
        }
    }
}
