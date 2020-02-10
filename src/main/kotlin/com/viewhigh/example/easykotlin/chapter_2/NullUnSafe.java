package com.viewhigh.example.easykotlin.chapter_2;

public class NullUnSafe {

    public static void main(String[] args) {
        String name = getName();
        if (name != null) {
            System.out.println(name.length());
        }
    }


    public static String getName() {
        return null;
    }
}
