package Assesment1_Programs;

public class Q2_Arithmetic_assignmentOperators {
    public static void main(String[] args) {
      /*  Arithmetic and Assignment Operators
        Create a Java program that demonstrates various arithmetic and assignment operators.

                **Requirements:**
        - Use +, -, *, /, % operators
                - Demonstrate assignment operators (=, +=, -=, *=, /=)
        - Show the results of each operation*/
        //Arithmetic operators
        int a=10;
        int b=5;
       int  Sum=a+b;
       int mod=a%b;
        System.out.println("Addition of 2 numbers"+Sum);
        System.out.println("Subtraction of 2nos"+ (a-b));
        System.out.println("Multiplication of 2nos"+ (a*b));
        System.out.println("Division of 2nos"+(a/b));
        System.out.println("Modules of 2nos"+(a % b ));
        //Increment/Decrement Operators
        int j=5;
        System.out.println("Pre increment:"+ j++);
        System.out.println("Post increment: " + ++j);
        System.out.println("pre decrement:"+ j--);
        System.out.println("Post decrement:"+ --j);
        //Assignment Operators
        int t = 10;
        System.out.println("t = " + t);
        t += 5;
        System.out.println("t += 5 -> " + t);
        // Subtract and assign
        t-= 3;
        System.out.println("t -= 3 -> " + t);

        // Multiply and assign
        t *= 2;
        System.out.println("t *= 2 -> " + t);

        // Divide and assign
        t /= 4;
        System.out.println("t /= 4 -> " + t);

        // Modulus and assign
        t %= 5;
        System.out.println("t %= 5 -> " + t);

        }

}
