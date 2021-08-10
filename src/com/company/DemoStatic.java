package com.company;

import java.util.Scanner;

public class DemoStatic {
    public static int id;

    static {
        id = 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hello();
        System.out.println(id);
        Product p = new Product();
        System.out.println(id);
        DemoAccessModifier1 demoAccessModifier1 = new DemoAccessModifier1();
        System.out.println(demoAccessModifier1.a);
        System.out.println(demoAccessModifier1.b);
        System.out.println(demoAccessModifier1.c);
    }

    public static void hello(){
        System.out.println("Hello C0621H1");
    }

    public void eat(){
        System.out.println(id);
        hello();
        System.out.println("Ăn sáng");
    }
}
