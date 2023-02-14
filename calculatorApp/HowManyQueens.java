import java.util.Scanner;

public class HowManyQueens {
    static int n;
    static char[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            board[i] = sc.next().toCharArray();
        }
        sc.close();

        int count = solve(0, 0);
        System.out.println(count);
    }

    private static int solve(int row, int queens) {
        if (row == n) {
            return queens;
        }
        int maxQueens = queens;
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 'Q';
                int nextQueens = solve(row + 1, queens + 1);
                if (nextQueens > maxQueens) {
                    maxQueens = nextQueens;
                }
                board[row][col] = '.';
            }
        }
        int nextQueens = solve(row + 1, queens);
        if (nextQueens > maxQueens) {
            maxQueens = nextQueens;
        }
        return maxQueens;
    }

    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q' || board[i][col] == 'Q') {
                return false;
            }
            int j = row - (col - i);
            if (j >= 0 && j < n && board[j][i] == 'Q') {
                return false;
            }
            j = row + (col - i);
            if (j >= 0 && j < n && board[j][i] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
