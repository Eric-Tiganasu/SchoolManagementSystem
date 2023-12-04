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
        system.addDepartment("Law");
        system.addDepartment("Art");
        system.addDepartment("Architecture");
        system.addTeacher("Yi", "Wang", "D001");
        system.addStudent("Laurie", "Chammah", "D002");
        system.addCourse("Programming", 3.0, "D001");

        System.out.println(system.findDepartment("D001"));
        System.out.println(system.findTeacher("T001"));
        System.out.println(system.findCourse("C001"));
        System.out.println(system.findStudent("S001"));

        system.findDepartments();
        system.printStudents();
        system.printTeachers();
    }
}