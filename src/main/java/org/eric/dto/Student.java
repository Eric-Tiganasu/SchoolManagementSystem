package org.eric.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Eric Tiganasu
 * The student class
 */
@Getter
@Setter
@EqualsAndHashCode
public class Student {
    private String id;
    private static int nextId = 1;
    private static final int MAX_COURSE_NUM = 5;

    private String fname;
    private String lname;
    private Department department;
    private Course[] courses;

    public Student(String fname, String lname, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.courses = new Course[MAX_COURSE_NUM];
    }

    @Override
    public String toString() {
        StringBuilder courseStr = new StringBuilder("[");
        for (Course course : courses) {
            if (course == null) {
                continue;
            }

            courseStr.append(course).append(", ");
        }
        courseStr.append("]");

        return "Student(" +
                "id=" + id + ", " +
                "fname=" + fname + ", " +
                "lname=" + lname + ", " +
                "department=" + department + ", " +
                "courses=" + courseStr +
                ')';
    }
}
