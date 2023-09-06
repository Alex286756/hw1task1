package ru.kuksov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String name;
    private ArrayList<Integer> assessments;

    public Student(String name) {
        this.name = name;
        assessments = new ArrayList<>();
    }

    public Student(String name, ArrayList<Integer> assessments) {
        this.name = name;
        this.assessments = assessments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAssessment(Integer newAssessment) {
        assessments.add(newAssessment);
    }

    public void delAssessment(Integer oldAssessment) {
        assessments.remove(oldAssessment);
    }

    public ArrayList<Integer> getAssessments() {
        return assessments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(assessments, student.assessments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, assessments);
    }

    @Override
    public String toString() {
        return name + ": [" + assessments + ']';
    }
}
