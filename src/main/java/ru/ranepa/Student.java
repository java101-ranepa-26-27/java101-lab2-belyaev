package ru.ranepa;

import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

    System.out.println("Введите имя студента");
    String name = in.nextLine().trim();
    Student student = new Student(name);
}}
