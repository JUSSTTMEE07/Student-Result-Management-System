import java.util.*;

public class ResultManager {
    private static Student[] students = new Student[100];  // can hold up to 100 students
    private static int studentCount = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            mainMenu();
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Scanner closed. Exiting program.");
        }
    }

    private static void mainMenu() {
        int choice;
        do {
            System.out.println("\n===== Student Result Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show Student Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                choice = sc.nextInt();
                sc.nextLine();  // consume newline
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        showStudentDetails();
                        break;
                    case 3:
                        System.out.println("Exiting program. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type! Please enter a number.");
                sc.nextLine();  // clear invalid input
                choice = 0;
            }
        } while (choice != 3);
    }

    private static void addStudent() {
        try {
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            students[studentCount++] = new Student(roll, name, marks);
            System.out.println("Student added successfully. Returning to main menu...");
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Marks must be integers.");
            sc.nextLine(); // clear buffer
        }
    }

    private static void showStudentDetails() {
        System.out.print("Enter Roll Number to search: ");
        int roll = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRollNumber() == roll) {
                students[i].displayResult();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No student found with Roll Number: " + roll);
        }
    }
}
