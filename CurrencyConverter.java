import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usdToInr = 83.2;
        double eurToInr = 91.5;

        System.out.println("Choose conversion: 1. USD to INR  2. EUR to INR");
        int choice = sc.nextInt();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (choice == 1) {
            System.out.println("INR: ₹" + (amount * usdToInr));
        } else if (choice == 2) {
            System.out.println("INR: ₹" + (amount * eurToInr));
        } else {
            System.out.println("Invalid choice");
        }
    }
}
