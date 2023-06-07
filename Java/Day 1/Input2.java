import java.util.*;


public class Input2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        String str = sc.nextLine();   

        
        System.out.println(str);
/* Issue of next and nextLine answered by chatgpt

The issue in your code is related to the usage of the Scanner class and its next() and nextLine() methods.

In the given code snippet, you are trying to read input using sc.next() to store it in the name variable. Then, you are trying to read input using sc.nextLine() to store it in the str variable.

However, there is a problem with mixing the next() and nextLine() methods of the Scanner class.

When you use sc.next(), it reads the next input token (a sequence of characters separated by whitespace) and returns it as a String. It only reads up to the first whitespace character, and the newline character (\n) is considered whitespace. So, if you enter a single word as input, it will work correctly.

But when you subsequently use sc.nextLine(), it reads the remaining characters on the current line, including the newline character (\n) left by the previous next() call. As a result, the str variable will end up storing an empty string ("").

To fix this issue, you can add an additional sc.nextLine() after sc.next() to consume the remaining newline character before reading the next line of input. Here's an updated version of your code:

java
Copy code
Scanner sc = new Scanner(System.in);
String name = sc.next();
System.out.println(name);

sc.nextLine(); // Consume the newline character left by sc.next()

String str = sc.nextLine();
System.out.println(str);
By calling sc.nextLine() after sc.next(), you are consuming the leftover newline character, and then sc.nextLine() will correctly read the next line of input into the str variable.
*/
        int a = sc.nextInt();
        System.out.println(a);
        int b = sc.nextInt();
        System.out.println(b);

    }
}