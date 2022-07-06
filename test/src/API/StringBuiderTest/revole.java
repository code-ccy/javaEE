package API.StringBuiderTest;

import java.util.Scanner;

public class revole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        StringBuilder reSb = sb.reverse();
        String s1 = reSb.toString();
        if (s1.equals(s)){
            System.out.println("是反转字符串" );
        }else {
            System.out.println("不是反转字符");
        }
    }
}
