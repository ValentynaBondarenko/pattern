package com.luxoft.lections.flyweight;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

//1.Question: What hepand next:
        System.out.println(s1 == s2);//
        System.out.println(s2 == s3);//
        System.out.println(s3 == s4);//

//1.Question: s1 in the p:
        System.out.println(s1.intern()==s2.intern());//
        System.out.println(s2.intern()==s3.intern());//
    }
}
