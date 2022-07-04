package API.StringBuiderTest;

public class demoStringBuilder {
    public static void main(String[] args) {
        method();
        method2();
    }

    public static void method() {
        long start = System.currentTimeMillis();
        String s="";
        for (int i = 0; i < 100000; i++) {
            s+=i;
        }
        long end = System.currentTimeMillis();
        long result=end-start;
        System.out.println("result = " + result);
    }
    public static void method2() {
        long start = System.currentTimeMillis();
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            s.append(i);
        }
        long end = System.currentTimeMillis();
        long result=end-start;
        System.out.println("result = " + result);
    }
}
