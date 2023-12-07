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
        system.addTeacher("Raymond", "Lapointe", "D001");
        system.addStudent("Laurie", "Chammah", "D002");
        system.addCourse("Programming", 3.0, "D001");

        system.registerCourse("S001", "C001");

        System.out.println(system.findDepartment("D003"));
        System.out.println(system.findTeacher("T001"));
//        System.out.println(system.findCourse("C001"));
//        System.out.println(system.findStudent("S001"));
//        System.out.println(system.findStudent("S004"));

        system.findDepartments();
        system.printStudents();
        system.printTeachers();

        system.modifyCourseTeacher("C002", "T001");
        system.modifyCourseTeacher("C001", "T003");
    }
}