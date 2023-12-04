package org.eric;

import org.eric.dto.*;

/**
 * @author Eric Tiganasu
 * The main class for the School Management System
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem();

        system.addDepartment("Computers");
        system.addDepartment("Medicine");
        system.findDepartments();

    }
}