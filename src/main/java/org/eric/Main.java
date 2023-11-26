package org.eric;

import org.eric.dto.Course;
import org.eric.dto.Department;
import org.eric.dto.Student;
import org.eric.dto.Teacher;

/**
 * @author Eric Tiganasu
 * The main class for the School Management System
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Laurie", "Chammah");
        Teacher t1 = new Teacher("Yi", "Wang");
        Department d1 = new Department("Computers");
        Course c1 = new Course("Programming", d1);

        System.out.println(c1);
        System.out.println(t1);
        System.out.println(s1);
    }
}