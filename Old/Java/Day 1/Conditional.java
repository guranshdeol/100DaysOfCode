import java.util.*;
public class Conditional{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();

        // if (a%2==0 ){
        //     System.out.println("THE NUMBER IS EVEN>");
        // }
        
        // else {
        //     System.out.println("THE NUMBER IS ODD");
        // }


        //income tex calculator

        // int income = sc.nextInt();
        
        // if (income < 500000){
        //     System.out.println("Your Tax is 0% and Tax Amount is = 0") ;        
        // }
        // else if (income >= 500000 && income <=1000000 ){
        //     System.out.println("Your Tax is 20% and Tax Amount is = " + income*0.2);

        // }
        // else{
        //     System.out.println("Your Tax is 30% and Tax Amount is = " + income*0.3) ;   
        
        // }
        // Print largest of 3 numbers

        // int a = 40;
        // int b = 30;
        // int c = 60;

        // if (a > b && a >c){
        //     System.out.println("a");

        // }
        // else if (b > c){
        //     System.out.println("b");
        // }
        // else{
        //     System.out.println("c");
        // }
        
        //ternary operator
        // int no = 103;

        // String s = (no %2 ==0)? "even":"odd";
        // System.out.println(s);

        //check whether a student will pass or fail

        // int marks = 33;
        // String result = (marks >=33)? "Pass": "Fail";
        // System.out.println(result);

        //Switch Statement

        int no = 3;
        switch(no){
            case 1: System.out.println("Mango");
            break;
            case 2: System.out.println("Banana");
            break;
            case 3: System.out.println("Orange");
            break;
            default: System.out.println("Good mOrning");
        }

    }
}