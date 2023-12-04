package org.eric.dto;

/**
 * @author Eric Tiganasu
 * The student class
 */
public class Student {
    private String id;
    private static int nextId = 1;

    private Course[] courses;
    private String fname;
    private String lname;
    private Department department;


    public Student(String fname, String lname, Department departmentName) {
        this.id = String.format("S%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = departmentName;
    }
}
