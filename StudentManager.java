import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentManager {
    static List<Student> students = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add 2.Display 3.Remove 4.Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Name: ");
                String name = sc.nextLine();
                students.add(new Student(id, name));
            } else if (choice == 2) {
                for (Student s : students)
                    System.out.println(s.id + ": " + s.name);
            } else if (choice == 3) {
                System.out.print("ID to remove: ");
                int id = sc.nextInt();
                students.removeIf(s -> s.id == id);
            } else break;
        }
    }
}
