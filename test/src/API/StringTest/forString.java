package API.StringTest;

import java.util.Scanner;

public class forString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
        char[] ch=s.toCharArray();
        System.out.println("ch = " + ch);
        char[] chars = s.toCharArray();
    }
}
