import java.util.Scanner;

public class Ques{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Chech whether a year is a leap year or not
        System.out.println("Enter the year you want to check for ");
        int x = sc.nextInt();
        if(x%4==0){
            if(x%100==0){
                if(x%400==0){
                    System.out.println("Leap Year");
                }
                else {
                    System.out.println("NOt a Leap Year");
                }
                
            }
            else{
                    System.out.println("Leap Year");
                }
        }
        else{
            System.out.println("Not a leap year");
        }
    
        
    }
}