import java.util.*;

public class StudentManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- Student Record Manager ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            // ADD STUDENT
            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                students.add(name);
                System.out.println("Student added!");
            }

            // VIEW STUDENTS
            else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    System.out.println("\nStudent List:");
                    for (String s : students) {
                        System.out.println("- " + s);
                    }
                }
            }

            // SEARCH STUDENT
            else if (choice == 3) {
                System.out.print("Enter name to search: ");
                String search = sc.nextLine();

                if (students.contains(search)) {
                    System.out.println("Student found!");
                } else {
                    System.out.println("Student not found.");
                }
            }

            // DELETE STUDENT
            else if (choice == 4) {
                System.out.print("Enter name to delete: ");
                String name = sc.nextLine();

                if (students.remove(name)) {
                    System.out.println("Student removed!");
                } else {
                    System.out.println("Student not found.");
                }
            }

            // INVALID INPUT
            else if (choice != 5) {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        System.out.println("Program exited.");
        sc.close();
    }
}