package com.pack.session13_14_homework_17_09_2025;

import java.util.*;

// base abstract class
abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String sex;
    protected int age;
    protected String dob;
    protected String cnp;
    protected String address;

    public Person(String firstName, String lastName, String sex, int age, String dob, String cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dob = dob;
        this.cnp = cnp;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

class Student extends Person {
    public Student(String firstName, String lastName, String sex, int age, String dob, String cnp, String address) {
        super(firstName, lastName, sex, age, dob, cnp, address);
    }
}

class Professor extends Person {
    public Professor(String firstName, String lastName, String sex, int age, String dob, String cnp, String address) {
        super(firstName, lastName, sex, age, dob, cnp, address);
    }
}

class Course {
    private String name;
    private String schedule;
    private String duration;
    private String description;
    private Professor professor;

    public Course(String name, String schedule, String duration, String description) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDetails() {
        return "Course: " + name + "\nSchedule: " + schedule + "\nDuration: " + duration +
                "\nDescription: " + description +
                "\nProfessor: " + (professor != null ? professor.getFullName() : "Not assigned");
    }
}

class College {
    private List<Student> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showCourses() {
        for (Course c : courses) {
            System.out.println(c.getDetails());
            System.out.println("-----------");
        }
    }
}


public class CollegeManagementSystem {
    public static void main(String[] args) {
        College college = new College();

        Professor prof = new Professor("John", "Doe", "M", 45, "1978-03-15", "123456789", "123 Main St");
        college.addProfessor(prof);

        Course math = new Course("Math", "Mon-Wed-Fri 10AM", "6 months", "Basic Math Course");
        math.assignProfessor(prof);
        college.addCourse(math);

        college.showCourses();
    }
}
