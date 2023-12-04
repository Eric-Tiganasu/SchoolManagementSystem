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
    private String fname;
    private String lname;
    private Department department;

    public Teacher(String fname, String lname) {
        this.id = String.format("T%03d", nextId++);
        this.lname = lname;
        this.fname = fname;
    }
}
