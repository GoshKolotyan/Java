//package org.example;
//
//import java.util.Arrays;
//
//public class CourseWithStudentsAndTeachers {
//    public static void main(String[] args) {
//        // Create student and teacher objects
//        Student student1 = new Student("Gosh", "123", "gosha3109001@gmail.com");
//        Student student2 = new Student("Vle", "456", "vle@example.com");
//        Student student3 = new Student("Lili", "789", "lili@example.com");
//        Teacher teacher1 = new Teacher("Kamo", "Mathematics", "Harutyunyan@mail.com");
//
//        // Create arrays of students and teachers
//        Student[] studentsArray = {student1, student2, student3};
//        Teacher[] teachersArray = {teacher1};
//
//        // Create a Course object and initialize it with students and teachers
//        Course course = new Course("CS101", "Introduction to Java", 20, 3, studentsArray, teachersArray);
//
//        // Uncomment and test adding students and teachers
////         course.addStudents("Gosh");
////         course.addStudents("Vle");
////         course.addStudents("Lili");
////         course.addStudents("Armen");
//
////         course.addTeachers("Kamo Harutyunyan");
////         course.addTeachers("Artak Afyan");
//
//        // Uncomment and implement displayCourseInfo if needed
//        // course.displayCourseInfo(course.getCourseName(), course.getCourseCode());
//
//        // Display student and teacher information
//        course.displayStudents();
//        course.displayTeachers();
//    }
//}

package org.example;

import java.util.Scanner;

public class CourseWithStudentsAndTeachers {
    public static void main(String[] args) {
        StudyProgram studyProgram = new StudyProgram();
        studyProgram.startProgram();
    }
}

