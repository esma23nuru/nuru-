import java.util.Scanner;

public class TicTacToe {
    private int[][] board;
    private int currentPlayer;

    // Constructor
    public TicTacToe() {
        board = new int[3][3];
        currentPlayer = 1;
    }

    // Method to display the board
    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to make a move
    public boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == 0) {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    // Method to check if the game has been won
    public boolean isWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    // Method to check if the board is full
    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Main method to play the game
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        int row, col;

        while (true) {
            game.displayBoard();
            System.out.println("Player " + game.currentPlayer + "'s turn. Enter row and column (0, 1, or 2):");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                if (game.isWinner()) {
                    game.displayBoard();
                    System.out.println("Player " + game.currentPlayer + " wins!");
                    break;
                } else if (game.isDraw()) {
                    game.displayBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                game.currentPlayer = (game.currentPlayer == 1) ? 2 : 1;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }
}