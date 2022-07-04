package API.StringTest;

import java.util.Scanner;

public class Stringdemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("text = " + text);
        int haha = haha(9);
        System.out.println("haha = " + haha);
    }
    public static int haha(int tmp){
        return tmp+9;
    }
}
