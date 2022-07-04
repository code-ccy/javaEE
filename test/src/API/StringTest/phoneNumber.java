package API.StringTest;

import java.util.Scanner;

public class phoneNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number = sc.nextLine();
//        String number="18377324720";
        String start = number.substring(0, 3);
        String end = number.substring(7);
        String tmp=start+"****"+end;
        System.out.println("tmp = " + tmp);
    }
}
