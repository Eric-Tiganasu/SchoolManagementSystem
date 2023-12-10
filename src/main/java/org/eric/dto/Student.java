package org.eric.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Eric Tiganasu
 * The student class
 */
@Getter
@Setter
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

    /**
     * Makes the course array to a string. I made this method because by putting it in the
     * actual toString() method, there will be a stackOverflowError. By putting it outside of
     * that method, I can simply use it inside without there being an error.
     * @return courseStr
     */
    public StringBuilder courseStr() {
        StringBuilder courseStr = new StringBuilder("[");

        for (Course course : courses) {
            if (course == null) {
                continue;
            }

            courseStr.append(course.getCourseName()).append(" ").append(", ");
        }

        courseStr.append("]");

        return courseStr;
    }

    @Override
    public String toString() {

        return "Student(" +
                "id=" + id + ", " +
                "fname=" + fname + ", " +
                "lname=" + lname + ", " +
                "department=" + department + ", " +
                "courses=" + courseStr() +
                ')';
    }
}
