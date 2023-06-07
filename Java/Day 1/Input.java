import java.util.*;

public class Input{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
      //  String name = sc.next();   // only stores string before a space. if we want to store even after space we will use nextLine.
        
       // System.out.println(name);

        String fullname = sc.nextLine(); //this will store before next line.
        System.out.println(fullname);
        
    }
}