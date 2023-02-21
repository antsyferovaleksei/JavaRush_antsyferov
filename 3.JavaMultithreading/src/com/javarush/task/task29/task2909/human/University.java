package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
       // super(name, age, 0);
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double value) {
        //TODO:
        for (Student student: students) {
            if(Double.compare(student.getAverageGrade(), value) == 0){
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double tempValue = 0d;
        double maxValue = Double.MIN_VALUE;
        Student exactStudent = null;

        for (Student student: students) {
            tempValue = student.getAverageGrade();
            if(Double.compare(maxValue, tempValue) < 0){
                maxValue = tempValue;
                exactStudent = student;
            }
        }
        return exactStudent;
    }

    public Student getStudentWithMinAverageGrade() {
        double tempValue = 0d;
        double minValue = Double.MAX_VALUE;
        Student exactStudent = null;

        for (Student student: students) {
            tempValue = student.getAverageGrade();
            if(Double.compare(minValue, tempValue) > 0){
                minValue = tempValue;
                exactStudent = student;
            }
        }
        return exactStudent;
    }

    public void expel(Student student){
        students.remove(student);
    }
}