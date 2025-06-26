package assessment2_Strings;

public class Q1_String_Basic_Functions {
    public static void main(String[] args) {
        //Write a Java program that demonstrates basic string operations
        // including concatenation, length, substring, and character extraction.

        String s1="Hello";
        String s2="World";
        String s3=s1.concat(s2);
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3);
        System.out.println(s3.length());
        System.out.println(s3.substring(4,7));
        System.out.println(s3.charAt(5));
        System.out.println(s3.toUpperCase());

    }
}
