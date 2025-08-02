import java.io.*;
import java.util.*;

class Contact {
    String name, phone;
    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class ContactBook {
    static ArrayList<Contact> contacts = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add 2.View 3.Search 4.Delete 5.Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Phone: ");
                String phone = sc.nextLine();
                contacts.add(new Contact(name, phone));
            } else if (choice == 2) {
                for (Contact c : contacts) {
                    System.out.println(c.name + " - " + c.phone);
                }
            } else if (choice == 3) {
                System.out.print("Search name: ");
                String search = sc.nextLine();
                for (Contact c : contacts) {
                    if (c.name.contains(search)) {
                        System.out.println(c.name + " - " + c.phone);
                    }
                }
            } else if (choice == 4) {
                System.out.print("Name to delete: ");
                String del = sc.nextLine();
                contacts.removeIf(c -> c.name.equalsIgnoreCase(del));
            } else break;
        }
    }
}
