package API.StringTest;

public class equalsTest {
    public static void main(String[] args) {
        String s1="ABC";
        String s2="ABC";
        String s4="A";
        String s3="AB"+"C";
        String s5=s4+"BC";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s5.equals(s3));
        System.out.println(s1.equals(s5));
        System.out.println("=============================");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s2);
        System.out.println(s5==s2);
        System.out.println(s1==s5);
    }
}
