public class Datatype{
    public static void main(String args[]){
        byte by =8;
        System.out.println(by);

        char ch = 'a';
        System.out.println(ch);

        boolean var = true;
        boolean var1 = false;
        System.out.println(var);
        System.out.println(var1);

        float price = 1.52f;         /*  Doubt: but acccording to chat gpt  your code, you are trying to assign the value 1.5 to a float variable price. However, the compiler is giving an error because a double value cannot be directly assigned to a float variable without an explicit type cast.

To fix this error, you can either change the variable type to double:

java
Copy code
double price = 1.5;
Or explicitly cast the double value to a float:

java
Copy code
float price = (float) 1.5;
By using the explicit cast (float), you are telling the compiler that you are aware of the possible loss of precision from double to float, and you explicitly want to perform the conversion.

Alternatively, if you want to keep the variable type as float and assign a floating-point value, you can use the f or F suffix to indicate a float literal:
*/
        System.out.println(price);

        int number = 20;
        System.out.println(number);

        //long = 

        //double = 
        // short = 240


        // sum of a and b

        int a = 10;
        int b = 9;
        int sum = a + b;

        System.out.println(sum);

        System.out.println(a+b);  // also works like this aswell.

    }
}