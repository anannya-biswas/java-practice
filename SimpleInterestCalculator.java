import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = input.nextDouble();
        System.out.print("Rate of Interest: ");
        double r = input.nextDouble();
        System.out.print("Time (years): ");
        double t = input.nextDouble();

        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
        input.close();
    }
}
