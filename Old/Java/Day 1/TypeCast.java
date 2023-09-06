public class TypeCast{
    public static void main(String args[]) {
        
        float f = 3.14f;

        //int a = f;   // not allowed by java it will say there will be lossy conversion.
        // int a = (int) f;
        // System.out.println(a); 

        char ch = 'a';
        int no = ch;
        System.out.println(no);

         char ch2 = 'A';
        int no2 = ch2;
        System.out.println(no2);
    }
}