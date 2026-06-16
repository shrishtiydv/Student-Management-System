package app;

import dao.StudentDAO;
import model.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student Course");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("6. Search Student By ID");
            System.out.println("7. Search Student By Name");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    if(name.trim().isEmpty()) {

                        System.out.println("Name cannot be empty");

                        break;
                    }

                    System.out.print("Enter Age: ");

                    int age;

                    try {

                        age = sc.nextInt();

                    } catch (Exception e) {

                        System.out.println("Please enter a valid number");

                        sc.nextLine();

                        break;
                    }

                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    if(course.trim().isEmpty()) {

                        System.out.println("Course cannot be empty");

                        break;
                    }

                    Student student =
                            new Student(name, age, course);

                    dao.addStudent(student);

                    break;

                case 2:

                    dao.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    dao.updateStudentCourse(id, newCourse);

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);

                    break;

                case 5:

                    System.out.println("Thank You!");
                    System.exit(0);

                case 6:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    dao.searchStudentById(searchId);

                    break;

                case 7:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String searchName = sc.nextLine();

                    dao.searchStudentByName(searchName);

                    break;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}