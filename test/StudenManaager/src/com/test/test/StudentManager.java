package com.test.test;

import com.test.domian.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Student> list=new ArrayList<>();
        lo:while (true){
            memu();
            System.out.println("请输入你的选择：");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
//                    System.out.println("添加学生信息");
                    addStudent(list);
                    break;
                case 2:
//                    System.out.println("查看学生信息");
                    showStudent(list);
                    break;

                case 3:
//                    System.out.println("修改学生信息");
                    updateStudent(list);
                    break;
                case 4:
//                    System.out.println("删除学生信息");
                    deleStudent(list);
                    break;
                case 5:
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("你输入有误重新输入！");
                    break;




            }

        }

    }

    public static void deleStudent(ArrayList<Student> list) {
        System.out.println("请输入要删除的学号：");
        String sid=new Scanner(System.in).nextLine();
        int delIndenx=getIndex(list,sid);
        if (delIndenx==-1){
            System.out.println("你输入的学号不存在");
        }else {
            list.remove(delIndenx);
            System.out.println("删除成功");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入要修改的学号：");
        Scanner sc=new Scanner(System.in);
        String sid=sc.nextLine();
        int updateIndex=getIndex(list,sid);
        if (updateIndex==-1){
            System.out.println("您输入的学号不存在！");
            return;
        }else {
            Student stu = list.get(updateIndex);
            System.out.println("请输入姓名：");
            stu.setName(sc.next());
            System.out.println("请输入年龄：");
            stu.setAge(sc.nextInt());
            System.out.println("请输入出生日期：");
            stu.setBirthday(sc.next());
        }
    }

    //展示学生信息
    public static void showStudent(ArrayList<Student> list) {
        if(list.size()!=0){
            System.out.println("学号\t姓名\t年龄\t生日");
            for (int i = 0; i < list.size(); i++) {
                Student stu=list.get(i);
                System.out.println(stu.getSid()+"\t"+stu.getName()+"\t"+stu.getAge()+"岁"+"\t"+stu.getBirthday());

            }

        }else {
            System.out.println("没有学生信息，请录入学生信息！");
        }
    }
//添加学生信息
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        String sid;
        while (true){
            System.out.println("请输入学号：");
            sid = sc.next();
            int addIndex=getIndex(list,sid);
            if (addIndex==-1){
                break;
            }else {
                System.out.println("学号重复了");
            }
        }

        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age=sc.nextInt();
        System.out.println("请输入出生日期：");
        String birthday = sc.next();
        Student stu=new Student(sid,name,age,birthday);
        list.add(stu);
        System.out.println("添加成功");
    }
//主界面
    public static void memu() {
        System.out.println("----学生管理系统-----");
        System.out.println("1 添加学生信息");
        System.out.println("2 查看学生信息");
        System.out.println("3 修改学生信息");
        System.out.println("4 删除学生信息");
        System.out.println("5 退出");
        System.out.println("------------------");
    }
//    获取索引
    public static int getIndex(ArrayList<Student> list,String sid){
        int index=-1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String id=stu.getSid();
            if (id.equals(sid)){
                index=i;
            }

        }
        return index;
    }
}
