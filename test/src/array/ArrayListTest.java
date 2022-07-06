package array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("1111");
        list.add("1221");
        list.add("1331");
        list.add("1441");
        System.out.println("list = " + list);
//        增加
//        删除
//        removeMethod(list);
//        修改
//        setMethod(list);
//        查询
        String g = list.get(0);
        System.out.println("g = " + g);


    }

    public static void setMethod(ArrayList<String> list) {
        //        修改
        String s1 = list.set(1, "999");
        System.out.println("s1 = " + s1);
        System.out.println("list = " + list);
    }

    public static void removeMethod(ArrayList<String> list) {
        //        删除,根据内容删除
        boolean b1 = list.remove("1111");
        boolean b2 = list.remove("OOOOO");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("list = " + list);
//        根据索引删除
        String r1 = list.remove(2);
        System.out.println("r1 = " + r1);
        System.out.println("list = " + list);
    }
}
