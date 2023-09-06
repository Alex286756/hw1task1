package ru.kuksov;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        ArrayList<Object> assessment1 = new ArrayList<>();
        assessment1.add('5');
        assessment1.add('4');
        assessment1.add(3);
        assessment1.add(4);
        Student student2 = new Student("Peter", assessment1);
        ArrayList<Object> assessment2 = new ArrayList<>();
        assessment2.add('5');
        assessment2.add('4');
        assessment2.add(3);
        assessment2.add(4);
        Student student3 = new Student("Alexandr", assessment2);
        student3.setName("Alex");
        System.out.println("Студенты 1 и 2 равны? Ответ: " + student2.equals(student1));
        System.out.println("Студенты 2 и 3 равны? Ответ: " + student2.equals(student3));
        System.out.println("Студенты 1 и 3 равны? Ответ: " + student3.equals(student1));
        student1.addAssessment(5);
        student1.addAssessment(4);
        student1.addAssessment(3);
        student1.addAssessment(4);
        System.out.println("Студенты 1 и 3 равны? Ответ: " + student3.equals(student1));
        System.out.println("Студент 1: " + student1);
        System.out.println("Студент 1: " + student2);
        System.out.println("Студент 1: " + student3);
        System.out.println();
        student1.delAssessment(4);
        System.out.println("Студент 1: " + student1);
        System.out.println("Студент 3: " + student3);
        System.out.println("Студенты 1 и 3 равны? Ответ: " + student3.equals(student1));
        student3.delAssessment(4);
        System.out.println("Студент 1: " + student1);
        System.out.println("Студент 3: " + student3);
        System.out.println("Студенты 1 и 3 равны? Ответ: " + student3.equals(student1));
        student3.delAssessment(4);
        System.out.println("Студент 1: " + student1);
        System.out.println("Студент 3: " + student3);
        System.out.println("Студенты 1 и 3 равны? Ответ: " + student3.equals(student1));

    }
}