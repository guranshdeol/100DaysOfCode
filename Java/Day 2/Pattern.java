import java.util.*;

public class Pattern{
    public static void main(String args[]){

// //Star Pattern
//         for(int line = 1; line <=10; line++){
//             for (int star = 1; star<=line; star++){
//                 //one line
//                 System.out.print("*");

//             }
//             System.out.println();
//         }


// //Inverted Star Pattern
//         for (int i = 1; i<=4;i++){
//             for(int s = 1; s <= (4-i+1); s++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

// //Print Hapf piramid pattern
//         for(int l = 1; l <=4; l++){
//             for(int n = 1; n<=l; n++){
//                 System.out.print(n);
//             }
//             System.out.println();
//         }

//Print CHARACTER PAttern
        char chars='A';
        for(int l = 1; l<=4;l++){
            
            for(int ch = 1; ch <=l;ch++ ){
                System.out.print(chars);
                chars++;
            }
            System.out.println();
        }        
    }
}