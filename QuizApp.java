import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "Which planet is known as the Red Planet?\n1. Earth\n2. Mars\n3. Jupiter",
            "What is the capital of France?\n1. Berlin\n2. London\n3. Paris",
            "Who wrote 'Romeo and Juliet'?\n1. Shakespeare\n2. Dickens\n3. Tolkien"
        };
        int[] answers = {2, 3, 1};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int ans = sc.nextInt();
            if (ans == answers[i]) {
                score++;
            }
        }

        System.out.println("Your Score: " + score + "/" + questions.length);
    }
}
