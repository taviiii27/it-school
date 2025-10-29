package com.pack.session13_14_homework_17_09_2025;

import java.util.*;

class GradebookStudent {
    private String name;
    private String studentId;
    private List<Double> grades = new ArrayList<>();

    public GradebookStudent(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.size();
    }

    public String getInfo() {
        return name + " (" + studentId + ") Avg: " + getAverage();
    }

    public String getId() {
        return studentId;
    }
}

class Teacher {
    private String name;
    private List<GradebookStudent> students = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    public void addStudent(GradebookStudent s) {
        students.add(s);
    }

    public void assignGrade(String studentId, double grade) {
        for (GradebookStudent s : students) {
            if (s.getId().equals(studentId)) {
                s.addGrade(grade);
                return;
            }
        }
    }

    public void showClassGrades() {
        for (GradebookStudent s : students) {
            System.out.println(s.getInfo());
        }
    }
}


public class SchoolGradebook {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");

        GradebookStudent s1 = new GradebookStudent("Alice", "S001");
        GradebookStudent s2 = new GradebookStudent("Bob", "S002");

        teacher.addStudent(s1);
        teacher.addStudent(s2);

        teacher.assignGrade("S001", 90);
        teacher.assignGrade("S001", 85);
        teacher.assignGrade("S002", 78);

        teacher.showClassGrades();
    }
}
