package assessment2_Strings;
import java.lang.String;

public class Q2_StringComparision {
    public static void main(String[] args) {
        //String Comparison and Equality
        //Create a program that demonstrates different ways to compare strings in Java,
        // including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.

        String s1="Hello";
        String s2="Hello";
        String s3="hello";
        String s4=new String("Hello");
        String s5=new String("Hello");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s1==s5);//false
        System.out.println(s4==s5);//false
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println(s1.equals(s4));//true
        System.out.println(s4.equals(s5));//true
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s4));
    }
}
