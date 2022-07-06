package com.chen.test;

import com.chen.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> list=new ArrayList<>();

       lo: while (true){
           //1.主界面
           System.out.println(" =======欢迎来到学生管理系统=====" );
           System.out.println("\t\t 1 添加学生");
           System.out.println("\t\t 2 删除学生");
           System.out.println("\t\t 3 修改学生");
           System.out.println("\t\t 4 查看学生");
           System.out.println("\t\t 5 退出");
           System.out.println("\t\t 请输入你的选择：");
           String choice=sc.next();
            switch (choice){
                case "1":
//                    System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case "4":
//                    System.out.println("查看学生");
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("感谢你的使用");
                    break lo;
                default:
                    System.out.println("您输入有误！！");
                    break;
            }
        }

    }
//修改
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入要修改的学生信息！");
        Scanner sc=new Scanner(System.in);
        String sid=sc.nextLine();
        int index=getIndex(list,sid);
        if(index==-1){
            System.out.println("该学生信息不存在，请重新输入！！");
        }else {
            Student stu = list.get(index);
            System.out.println("请输入新的学生姓名：");
            stu.setName(sc.next());
            System.out.println("请输入新的学生年龄：");
            stu.setAge(sc.nextInt());
            System.out.println("请输入新的学生生日：");
            stu.setBirthday(sc.next());
            System.out.println("修改成功！");
        }
    }
//删除
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入你要删除的学号：");
        Scanner sc= new Scanner(System.in);
        String sid=sc.nextLine();
        int index=getIndex(list,sid);
        if (index==-1){
            System.out.println("查无信息，重新输入");
        }else {
            list.remove(index);
            System.out.println("删除成功！");
        }

    }
//查询
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size()!=0){
        System.out.println("学号\t\t姓名\t\t年龄\t\t出生日期");
        for (int i = 0; i < list.size(); i++) {
            Student stu= list.get(i);
            System.out.println(stu.getSid()+"\t"+stu.getName()+"\t"+stu.getAge()+"岁"+"\t"+stu.getBirthday());
        }
        }else {
            System.out.println("没有学生信息，请您录入学生信息！！");
            return;
        }
    }
//添加
    public static ArrayList<Student> addStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        String sid;
        while (true){
            System.out.println("请输入学号：");
             sid=sc.next();
            int index=getIndex(list,sid);
            if (index==-1){
                break;
            }else {
                System.out.println("该学号重复了！");
            }
        }


        System.out.println("请输入姓名：");
        String name=sc.next();
        System.out.println("请输入年龄：");
        int age=sc.nextInt();
        System.out.println("请输入出生日期：");
        String birthday=sc.next();
        Student stu=new Student(sid,name,age,birthday);
        list.add(stu);
        System.out.println("添加成功！！！");
        return list;
    }
//    获取索引
    public static int getIndex(ArrayList<Student> list,String sid){
        int index=-1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String id = stu.getSid();
            if(id.equals(sid)){
                index=i;
            }
        }
        return index;
    }

}
