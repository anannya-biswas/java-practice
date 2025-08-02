import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';
        int moves = 0;

        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter row and column (1-3):");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Convert to board indices (0-based)
            int boardRow = (row - 1) * 2;
            int boardCol = (col - 1) * 2;

            if (board[boardRow][boardCol] == ' ') {
                board[boardRow][boardCol] = currentPlayer;
                moves++;
            } else {
                System.out.println("Cell already occupied! Try again.");
                continue;
            }

            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (moves == 9) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Switch players
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    static void printBoard() {
        for (char[] row : board) {
            for (char c : row) System.out.print(c);
            System.out.println();
        }
    }

    static boolean checkWin(char player) {
        // Check rows
        for (int i = 0; i <= 4; i += 2)
            if (board[i][0] == player && board[i][2] == player && board[i][4] == player)
                return true;

        // Check columns
        for (int i = 0; i <= 4; i += 2)
            if (board[0][i] == player && board[2][i] == player && board[4][i] == player)
                return true;

        // Check diagonals
        if (board[0][0] == player && board[2][2] == player && board[4][4] == player)
            return true;
        if (board[0][4] == player && board[2][2] == player && board[4][0] == player)
            return true;

        return false;
    }
}
