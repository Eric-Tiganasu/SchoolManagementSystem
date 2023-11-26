package org.eric.dto;

import lombok.ToString;

/**
 * @author Eric Tiganasu
 * The department class
 */
@ToString
public class Department {
    private String id;
    private static int nextId = 1;
    private String departmentName;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }
}
