public class IfElse{
    public static void main(String args[]){

    int age = 18;

    if (age == 18){
System.out.println("Hello");
    }
    else if (age > 10){                           // multiple if will check for each if 
    // but else if or else will only work if (if) statement doesn't works.
        System.out.println("World");

    }

    else {
        System.out.println("How ");
    }
    }
}