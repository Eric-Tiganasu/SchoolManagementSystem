package org.eric.dto;

import lombok.ToString;

/**
 * @author Eric Tiganasu
 * The course class
 */
public class Course {
    private String id;
    private static int nextId = 1;
    private static final int MAX_STUDENT_NUM = 5;
    private String courseName;
    private Teacher teacher;
    private Student[] students;
    private Department department;

    public Course(String courseName, Department department) {
        this.id = String.format("C%03d", nextId++);
        this.courseName = courseName;
        this.department = department;
        this.teacher = teacher;
        this.students = new Student[MAX_STUDENT_NUM];
    }

    @Override
    public String toString() {
        StringBuilder studentStr = new StringBuilder("[");
        for (Student student : students) {
            if (student != null) {
                studentStr.append(student).append(", ");
            }
        }
        studentStr.append("]");

        return "Course(" +
                "id=" + id + ", " +
                "department=" + department + ", " +
                "teacher=" + teacher + ", " +
                "courseName=" + courseName + ", " +
                "students=" + studentStr +
                ')';
    }
}
