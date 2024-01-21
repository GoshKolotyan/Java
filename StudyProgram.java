package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class StudyProgram {
    private List<Course> courses;
    private Scanner scanner;

    public StudyProgram() {
        this.courses = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void startProgram() {
        int choice = 0;
        do {
            displayMenu();
            System.out.print("Choose one option: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                continue; // Skip the rest of this loop iteration
            }
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    displayRegisteredStudents();
                    break;
                case 2:
                    createNewCourse();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    private void displayMenu() {
        System.out.println("\nStudy Program Menu ");
        System.out.println("=".repeat(20));
        System.out.println("1. Display courses and the registered students");
        System.out.println("2. Create a new course");
        System.out.println("3. Exit");
    }


    private void addStudentsToCourse(Course course) {
        try {
            System.out.print("Enter the number of students to add: ");
            int numOfStudentsToAdd = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            for (int i = 0; i < numOfStudentsToAdd; i++) {
                System.out.println("Enter details for student " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("ID: ");
                String id = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();

                Student student = new Student(name, id, email);
                course.addStudents(student);
            }

            System.out.println(numOfStudentsToAdd + " students added to the course.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct details.");
        }
    }

    private void createNewCourse() {
        try {
            System.out.print("Course code: ");
            String courseCode = scanner.nextLine();

            System.out.print("Course name: ");
            String cName = scanner.nextLine();

            System.out.print("Enter the maximum number of students that can be enrolled in the course: ");
            int maxNumOfStudents = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (isValidCourseDetails(courseCode, cName, maxNumOfStudents)) {
                Course course = findCourseByCode(courseCode);

                if (course == null) {
                    System.out.println("Course not found. Creating a new course.");
                    course = new Course(courseCode, cName, maxNumOfStudents, new Student[0], new Teacher[0]);
                    courses.add(course);
                }

                addStudentsToCourse(course);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct details.");
        }
    }

    private boolean isValidCourseDetails(String courseCode, String cName, int maxNumOfStudents) {
        // Check if course code is not null and not empty
        if (courseCode == null || courseCode.trim().isEmpty()) {
            System.out.println("Invalid course code. It should not be empty.");
            return false;
        }

        // Check if course name is not null and not empty
        if (cName == null || cName.trim().isEmpty()) {
            System.out.println("Invalid course name. It should not be empty.");
            return false;
        }

        // Check if max number of students is greater than 0
        if (maxNumOfStudents <= 0) {
            System.out.println("Invalid number of students. It should be greater than 0.");
            return false;
        }

        // If all checks pass, return true
        return true;
    }




    private void displayRegisteredStudents() {
        if (courses.isEmpty()) {
            System.out.println("No course is established yet.");
            return;
        } else {
            System.out.print("Enter the course code: ");
            String cCode = scanner.nextLine();
            Course course = findCourseByCode(cCode);

            if (course == null) {
                System.out.println("Course not found.");
                return;
            }

            course.displayStudents();
        }
    }

    private Course findCourseByCode(String cCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equalsIgnoreCase(cCode)) {
                return course;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        StudyProgram studyProgram = new StudyProgram();
        studyProgram.startProgram();
    }
}