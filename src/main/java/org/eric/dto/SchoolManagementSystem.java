package org.eric.dto;

import lombok.ToString;

/**
 * @author Eric Tiganasu
 * The school management system class
 */
@ToString
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENTS = 5;
    private static final int MAX_STUDENTS = 200;
    private static final int MAX_TEACHERS = 20;
    private static final int MAX_COURSES = 30;

    private Student[] students = new Student[MAX_STUDENTS];
    private Department[] departments = new Department[MAX_DEPARTMENTS];
    private Teacher[] teachers = new Teacher[MAX_TEACHERS];
    private Course[] courses = new Course[MAX_COURSES];

    private int departmentCount = 0;
    private int studentCount = 0;
    private int teacherCount = 0;
    private int courseCount = 0;

    /**
     * Finds a department based on its id
     * @return specified department
     */
    public Department findDepartment(String id) {
        for (Department department : departments) {
            if (id.equals(department.getId())) {
                return department;
            }
        }
        return null;
    }

    /**
     * Displays the teachers
     */
    public void printTeachers() {
        for (Teacher teacher : teachers) {
            if (teacher == null) {
                continue;
            }

            System.out.println(teacher);
        }
    }

    /**
     * Modifies the teacher of a course
     */
    public void modifyCourseTeacher() {

    }

    /**
     * Adds a new department
     */
    public void addDepartment(String departmentName) {
        if (departmentCount < MAX_DEPARTMENTS) {
            departments[departmentCount] = new Department(departmentName);

            System.out.println("Add department " + departments[departmentCount] + " successfully.");
            departmentCount++;
        } else {
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    /**
     * Displays all the students
     */
    public void printStudents() {
        for (Student student : students) {
            if (student == null) {
                continue;
            }

            System.out.println(student);
        }
    }

    /**
     * Finds student based on its id
     * @return specified student
     */
    public Student findStudent(String id) {
        for (Student student : students) {
            if (id.equals(student.getId())) {
                return student;
            }
        }
        return null;
    }

    /**
     * Adds a course
     */
    public void addCourse(String courseName, double credit, String id) {
        if (courseCount < MAX_COURSES) {
            courses[courseCount] = new Course(courseName, 3.0, findDepartment(id));

            System.out.println(courses[courseCount] + " added successfully.");
            teacherCount++;
        } else {
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    /**
     * Registers a student to a course
     */
    public void registerCourse() {

    }

    /**
     * Adds a new teacher
     */
    public void addTeacher(String fname, String lname, String id) {
        if (teacherCount < MAX_TEACHERS) {
            teachers[teacherCount] = new Teacher(fname, lname, findDepartment(id));

            System.out.println(teachers[teacherCount] + " added successfully.");
            teacherCount++;
        } else {
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    /**
     * Finds a course based on its id
     * @return specified course
     */
    public Course findCourse(String id) {
        for (Course course : courses) {
            if (id.equals(course.getId())) {
                return course;
            }
        }
        return null;
    }

    /**
     * Displays all departments
     */
    public void findDepartments() {
        for (Department department : departments) {
            if (department == null) {
                continue;
            }

            System.out.println(department);
        }
    }

    /**
     * Adds a new student
     */
    public void addStudent(String fname, String lname, String id) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount] = new Student(fname, lname, findDepartment(id));

            System.out.println(students[studentCount] + " added successfully.");
            studentCount++;
        } else {
            System.out.println("Cannot add more students, students cap reached");
        }
    }

    /**
     * Finds a teacher based on its id
     * @return specified teacher
     */
    public Teacher findTeacher(String id) {
        for (Teacher teacher : teachers) {
            if (id.equals(teacher.getId())) {
                return teacher;
            }
        }
        return null;
    }
}
