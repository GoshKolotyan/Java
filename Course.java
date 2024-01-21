package org.example;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String cCode;
    private String cName;
    private int maxNumOfStudents;
    private List<Student> students;
    private int numOfRegStudents;
    private int maxTeachers;
    private List<Teacher> teachers;
    private int numOfRegTeachers;

    public Course(String cCode, String cName, int maxNumOfStudents, Student[] students, Teacher[] teachers) {
        this.cCode = cCode;
        this.cName = cName;
        this.maxNumOfStudents = maxNumOfStudents;
        this.students = new ArrayList<>(List.of(students));
        this.numOfRegStudents = 0;
        this.maxTeachers = maxTeachers;
        this.teachers = new ArrayList<>(List.of(teachers));
        this.numOfRegTeachers = 0;
    }

    public String getCourseName() {
        return cName;
    }

    public void setCourseName(String courseName) {
        cName = courseName;
    }

    public String getCourseCode() {
        return cCode;
    }

    public void setCourseCode(String courseCode) {
        // Add validation if needed
        cCode = courseCode;
    }

    public int getMaxNumOfStudents() {
        return maxNumOfStudents;
    }

    public void setMaxNumOfStudents(int maxNumOfStudents) {
        // Add validation if needed
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public List<Student> getStudentsList() {
        List<Student> studentListCopy = new ArrayList<>(students);
        return studentListCopy;
    }

    public void setStudentsList(List<Student> studentsList) {
        // Add validation or deep copy if needed
        students = new ArrayList<>(studentsList);
    }

    public int getNumOfRegStudents() {
        return numOfRegStudents;
    }

    public void setNumOfRegStudents(int numOfRegStudents) {
        // Add validation if needed
        this.numOfRegStudents = numOfRegStudents;
    }

    public int getMaxTeachers() {
        return maxTeachers;
    }

    public void setMaxTeachers(int maxTeachers) {
        // Add validation if needed
        this.maxTeachers = maxTeachers;
    }

    public int getNumOfRegTeachers() {
        return numOfRegTeachers;
    }

    public void setNumOfRegTeachers(int numOfRegTeachers) {
        // Add validation if needed
        this.numOfRegTeachers = numOfRegTeachers;
    }

    public List<Teacher> getTeachersList() {
        List<Teacher> teachersListCopy = new ArrayList<>(teachers);
        return teachersListCopy;
    }

    public void setTeachersList(List<Teacher> teachersList) {
        // Add validation or deep copy if needed
        teachers = new ArrayList<>(teachersList);
    }

    // Display methods...
    public void addStudents(Student student) {
        if (numOfRegStudents < maxNumOfStudents) {
            students.add(student);
            numOfRegStudents++;
        } else {
            System.out.println("Max Numbers Of Students Can't be added");
        }
    }
    // Change this method to accept a Student object for // first cone
//    public void addStudents(Student student) {
//        if (numOfRegStudents < maxNumOfStudents) {
//            students.add(student);
//            numOfRegStudents++;
//        } else {
//            System.out.println("Max Numbers Of Students Can't be added");
//        }
//    }

    public void removeStudents(Student  student) {
        if (students.contains(student)) {
            students.remove(student);
            numOfRegStudents--;
        } else {
            System.out.println("Student is not in the course");
        }
    }

    public void displayStudents() {
        System.out.println("List of students registered on course " + cCode + "  " + cName);
        System.out.printf("%-5s%-20s%-10s%-30s%n", "No", "Name", "ID", "Email");
        int i = 1;
        for (Student student : students) {
            System.out.printf("%-5d%-20s%-10s%-30s%n", i++, student.getName(), student.getID(), student.getEmail());
        }
    }

    public void addTeachers(Teacher teacher) {
        if (numOfRegTeachers < maxTeachers) {
            teachers.add(teacher);
            numOfRegTeachers++;
        } else {
            System.out.println("Max Numbers Of Teachers Can't be added");
        }
    }

    public void removeTeachers(String teacher) {
        if (teachers.contains(teacher)) {
            teachers.remove(teacher);
            numOfRegTeachers--;
            System.out.println("Teacher: " + teacher + "  Removed in Course" + cName);
        } else {
            System.out.println("Teacher is not in the course");
        }
    }

    public void displayTeachers() {
        System.out.println("List of teachers involved in the course " + cCode + "  " + cName);
        System.out.printf("%-5s%-20s%-20s%-30s%n", "No", "Name", "Role", "Email");
        int i = 1;
        for (Teacher teacher : teachers) {
            System.out.printf("%-5d%-20s%-20s%-30s%n", i++, teacher.getName(), teacher.getRole(), teacher.getEmail());
        }
    }
}