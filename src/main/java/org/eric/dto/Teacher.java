package org.eric.dto;

import lombok.ToString;

/**
 * @author Eric Tiganasu
 * The Teacher class
 */
@ToString
public class Teacher {
    private String id;
    private static int nextId = 1;
    private Department department;
    private String fname;
    private String lname;


    public Teacher(String fname, String lname) {
        this.id = String.format("T%03d", nextId++);
        this.department = department;
        this.lname = lname;
        this.fname = fname;
    }
}
