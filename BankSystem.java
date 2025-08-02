import java.util.Scanner;

class BankAccount {
    private double balance = 0;
    void deposit(double amount) { balance += amount; }
    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds");
    }
    void showBalance() { System.out.println("Balance: ₹" + balance); }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        while (true) {
            System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Amount: ");
                acc.deposit(sc.nextDouble());
            } else if (ch == 2) {
                System.out.print("Amount: ");
                acc.withdraw(sc.nextDouble());
            } else if (ch == 3) acc.showBalance();
            else break;
        }
    }
}
