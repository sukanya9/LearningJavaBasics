package assessment2_Strings;

public class Q3_StringBuildervsStringBuffer {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<100;i++)
        {
            sb1.append(i);

        }
        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer();
        for(int i=100;i>0;i--)
        {
            sb2.append(i);
           // System.out.println(sb2);
        }
        System.out.println(sb2);
        System.out.println("---------------------------");
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.append("World");
        System.out.println(sb);
        sb.insert(5, " Friends");
        System.out.println(sb);
        sb.replace(5,11,"Java");
        System.out.println(sb);
        sb.delete(9,11);
        System.out.println(sb);


    }
}
