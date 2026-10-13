package ru.ranepa;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> grades = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addGrade(int grade) {
        grades.add(grade);
    }

    double getAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return (double) sum / grades.size();
    }


    String getStatus() {
        double average = getAverage();
        if (average >= 4.5) {
            return "отличник";
        } else if (average >= 3.5) {
            return "хорошист";
        } else if (average >= 2.5) {
            return "троечник";
        } else {
            return "двоечник";
        }
    }

    void printReport() {
        System.out.println("Имя: " + name);
        System.out.println("Оценки: " + grades);
        System.out.println("Средний балл: " + getAverage());
        System.out.println("Статус: " + getStatus());
    }
}
