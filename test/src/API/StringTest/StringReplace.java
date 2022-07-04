package API.StringTest;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = s.replace("TMD", "???");
        System.out.println("result = " + result);
    }
}
