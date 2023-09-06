public class TypePromotion{
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';

       System.out.println((int)a);  //value of a in int
        System.out.println((int)b); // value of b in int
        System.out.println(b-a);

        char c = b - a; //java will through error here
                        // type promotion only happens for expressions like + - * .but will not do type promotion for normal variable.
        //eg 2
        short a = 5;
        byte b = 25;
        char c = 'c';

        byte bt = (byte) (a + b + c);


        int a2 = 10;
        float b2 = 20.25f
        long c2 = 25;
        double d2 = 30;
        double ans = a+b+c+d;
        int ans = a+b+c+d; // this will throw an error for lossy conversion, we did it to check whether it will promote the value of ans to double or not.....

    }
}