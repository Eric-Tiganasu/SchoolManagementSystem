package org.eric.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Eric Tiganasu
 * The course class
 */
@Getter
@Setter
@EqualsAndHashCode
public class Course {
    private String id;
    private static int nextId = 1;
    private static final int MAX_STUDENT_NUM = 5;
    private String courseName;
    private Teacher teacher;
    private Student[] students;
    private double credit;
    private Department department;

    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", nextId++);
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.students = new Student[MAX_STUDENT_NUM];
    }

    @Override
    public String toString() {
        StringBuilder studentStr = new StringBuilder("[");
        for (Student student : students) {
            if (student == null) {
                continue;
            }

            studentStr.append(student).append(", ");
        }
        studentStr.append("]");

        return "Course(" +
                "id=" + id + ", " +
                "courseName=" + courseName + ", " +
                "credit=" + credit + ", " +
                "teacher=" + teacher + ", " +
                "department=" + department + ", " +
                "students=" + studentStr +
                ')';
    }
}
