package org.eric.dto;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Eric Tiganasu
 * The Teacher class
 */
@ToString
@Getter
public class Teacher {
    private String id;
    private static int nextId = 1;
    private String fname;
    private String lname;
    private Department department;

    public Teacher(String fname, String lname, Department department) {
        this.id = String.format("T%03d", nextId++);
        this.lname = lname;
        this.fname = fname;
        this.department = department;
    }
}
