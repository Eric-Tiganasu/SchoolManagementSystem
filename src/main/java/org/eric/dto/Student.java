package org.eric.dto;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Eric Tiganasu
 * The student class
 */
@ToString
@Getter
public class Student {
    private String id;
    private static int nextId = 1;

    private String fname;
    private String lname;
    private Department department;
    private Course[] courses;

    public Student(String fname, String lname, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.courses = new Course[0];
    }
}
