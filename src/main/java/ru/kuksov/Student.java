package ru.kuksov;

import java.util.ArrayList;
import java.util.Objects;

public class Student {

    private String name;
    private ArrayList<Object> assessments;

    public Student(String name) {
        this.name = name;
        assessments = new ArrayList<>();
    }

    public Student(Object name, Object assessments) {
        if (name instanceof String)
            this.name = (String) name;
        if (assessments instanceof ArrayList<?>)
            this.assessments = (ArrayList<Object>) assessments;
    }

    public String getName() {
        return name;
    }

    public void setName(Object name) {
        if (name instanceof String)
            this.name = (String) name;
    }

    public void addAssessment(Object newAssessment) {
        assessments.add(newAssessment);
    }

    public void delAssessment(Integer oldAssessment) {
        assessments.remove(oldAssessment);
    }

    public ArrayList<Object> getAssessments() {
        return assessments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getAssessments(), student.getAssessments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAssessments());
    }

    @Override
    public String toString() {
        return getName() + ": " + getAssessments();
    }
}
