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
    private static final int MAX_COURSES_PER_STUDENT = 5;

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
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null && departmentId.equals(department.getId())) {
                return department;
            }
        }
        return null;
    }

    /**
     * Displays the teachers
     */
    public void printTeachers() {
        System.out.println("Displaying all teachers:");
        System.out.println("----------------");

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
    public void modifyCourseTeacher(String courseId, String teacherId) {
        if (findTeacher(teacherId) == null) {
            System.out.printf("Cannot find any teacher match with teacherId %s, modify teacher for course %s failed.\n",
                    teacherId, teacherId);
        } else if (findCourse(courseId) == null) {
            System.out.printf("Cannot find any course match with courseId %s, modify teacher for course %s failed.\n",
                    courseId, courseId);
        } else {
            Teacher teacher = findTeacher(teacherId);
            Course course = findCourse(courseId);

            course.setTeacher(teacher);
            System.out.println(course + " teacher info updated successfully.");
        }
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
        System.out.println("Displaying all students:");
        System.out.println("----------------");

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
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student != null && studentId.equals(student.getId())) {
                return student;
            }
        }
        return null;
    }

    /**
     * Adds a course
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        if (courseCount < MAX_COURSES) {
            courses[courseCount] = new Course(courseName, 3.0, findDepartment(departmentId));

            System.out.println(courses[courseCount] + " added successfully.");
            teacherCount++;
        } else {
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    /**
     * Registers a student to a course
     */
    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);
        Course[] studentCourses = student.getCourses();
        Student[] courseStudents = course.getStudents();

        if (student == null) {
            System.out.printf("Cannot find any student match with studentId %s, register course for student %s" +
                    "failed.\n", studentId, studentId);
        } else if (course == null) {
            System.out.printf("Cannot find any course match with courseId %s, register course for student %s " +
                    "failed.\n", courseId, studentId);
        } else if (student.getCourses().length > MAX_COURSES_PER_STUDENT) {
            System.out.printf("Student %s has already registered 5 courses, register course for student %s " +
                    "failed.",studentId, studentId);
        } else if (course.getStudents().length > 5) {
            System.out.printf("Course %s has been fully registered, register course %s for student %s failed.",
                    courseId, courseId, studentId);
        } else {
            for (int i = 0; i < studentCourses.length; i++) {
                if (studentCourses[i] == null) {
                    studentCourses[i] = course;

                    for (int j = 0; j < courseStudents.length; j++) {
                        if (courseStudents[j] == null) {
                            courseStudents[j] = student;
                            break;
                        }
                    }
                    break;
                }
            }

            System.out.print("Student register course successfully\n\n");
            System.out.printf("Latest student info: %s\n\n", student);
            System.out.printf("Latest course info: %s\n\n", course);
        }
    }

    /**
     * Adds a new teacher
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        if (teacherCount < MAX_TEACHERS) {
            teachers[teacherCount] = new Teacher(fname, lname, findDepartment(departmentId));

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
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course != null && courseId.equals(course.getId())) {
                return course;
            }
        }
        return null;
    }

    /**
     * Displays all departments
     */
    public void findDepartments() {
        System.out.println("Displaying all departments:");
        System.out.println("----------------");

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
    public void addStudent(String fname, String lname, String departmentId) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount] = new Student(fname, lname, findDepartment(departmentId));

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
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher != null && teacherId.equals(teacher.getId())) {
                return teacher;
            }
        }
        return null;
    }
}
