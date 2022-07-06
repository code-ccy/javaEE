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
                    System.out.println("添加学生信息");
                    addStudent(list);
                    break;
                case 2:
                    System.out.println("查看学生信息");
                    break;

                case 3:
                    System.out.println("修改学生信息");
                    break;
                case 4:
                    System.out.println("删除学生信息");
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

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学号：");
        String sid = sc.next();
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

    public static void memu() {
        System.out.println("----学生管理系统-----");
        System.out.println("1 添加学生信息");
        System.out.println("2 查看学生信息");
        System.out.println("3 修改学生信息");
        System.out.println("4 删除学生信息");
        System.out.println("5 退出");
        System.out.println("------------------");
    }
}
