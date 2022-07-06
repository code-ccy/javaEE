package API.StringBuiderTest;

public class construtionDemo {
    public static void main(String[] args) {
//        空参构造方法
        StringBuilder sb=new StringBuilder();
        System.out.println("sb = " + sb);
//        有参数构造方法
        StringBuilder sb2=new StringBuilder("哈哈哈哈");
        System.out.println("sb2 = " + sb2);
//        拼接
        sb2.append("123");
//        反转
        sb2.reverse();
        sb2.length();
    }
}
