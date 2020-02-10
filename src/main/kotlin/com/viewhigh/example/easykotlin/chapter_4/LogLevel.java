package com.viewhigh.example.easykotlin.chapter_4;

public enum LogLevel {
    DEBUG("debug"), WARN("warn"), ERROR("error");

    public String name;

    LogLevel(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        System.out.println(LogLevel.DEBUG);
        System.out.println(LogLevel.DEBUG.name);
    }
}
