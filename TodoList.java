import java.util.*;

public class TodoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (true) {
            System.out.println("1.Add 2.View 3.Remove 4.Exit");
            int c = sc.nextInt(); sc.nextLine();
            if (c == 1) {
                System.out.print("Enter task: ");
                tasks.add(sc.nextLine());
            } else if (c == 2) {
                for (int i = 0; i < tasks.size(); i++)
                    System.out.println((i+1) + ". " + tasks.get(i));
            } else if (c == 3) {
                System.out.print("Task number to remove: ");
                int i = sc.nextInt(); sc.nextLine();
                if (i > 0 && i <= tasks.size()) tasks.remove(i-1);
            } else break;
        }
    }
}
