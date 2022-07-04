package API.StringTest;

import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
       int smallCount=0;
       int bitCount=0;
       int numberCount=0;
       int others=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c=arr[i];
            if(c>='A' && c<='Z'){
                bitCount+=1;
            } else if (c>='a' && c<='z') {
                smallCount+=1;
            } else if (c>='0'&&c<='9') {
                numberCount+=1;

            }else {
                others+=1;
            }
        }
        System.out.println("大写字符个数："+bitCount);
        System.out.println("小写字符个数："+smallCount);
        System.out.println("数字字符个数："+numberCount);
        System.out.println("其他字符个数："+others);
    }
}
