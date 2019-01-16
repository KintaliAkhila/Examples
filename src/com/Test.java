package com;

public class Test {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");
        change(a, b);
        System.out.println(a + "," + b);
    }
    static void change(StringBuilder x, StringBuilder y) {
        y.append(x);
        y = x;
    }
 }