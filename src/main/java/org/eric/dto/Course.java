package org.eric.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Eric Tiganasu
 * The course class
 */
@Getter
@Setter
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

    /**
     * Makes the student array to a string. I made this method because by putting it in the
     * actual toString() method, there will be a stackOverflowError. By putting it outside of
     * that method, I can simply use it inside without there being an error.
     * @return studentStr
     */
    public StringBuilder studentStr() {
        StringBuilder studentStr = new StringBuilder("[");

        for (Student student : students) {
            if (student == null) {
                continue;
            }

            studentStr.append(student.getFname()).append(" ").append(student.getLname()).append(", ");
        }

        studentStr.append("]");

        return studentStr;
    }

    @Override
    public String toString() {

        return "Course(" +
                "id=" + id + ", " +
                "courseName=" + courseName + ", " +
                "credit=" + credit + ", " +
                "teacher=" + teacher + ", " +
                "department=" + department + ", " +
                "students=" + studentStr() +
                ')';
    }
}
