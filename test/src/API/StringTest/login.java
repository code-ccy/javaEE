package API.StringTest;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String username="admin";
        String passwd="123";
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pw = sc.nextLine();
            if (username.equals(name)&&passwd.equals(pw)){
                System.out.println("登录成功！！！");
                break;
            }else {
                System.out.println("密码或者用户名错误，你还有"+(2-i)+"次机会");
            }

        }
    }
}
