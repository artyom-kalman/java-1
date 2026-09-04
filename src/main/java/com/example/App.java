package com.example;

public class App {
    public static String greet(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {

        for (int i = 4; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println(greet("Zed"));
    }
}
