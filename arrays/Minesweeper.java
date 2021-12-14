public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[][] board = new int[m][n];

        int mines = k;
        int cells = m * n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((cells * Math.random()) <= mines) {
                    board[i][j] = 8;
                    mines--;
                    cells--;
                } else {
                    board[i][j] = 0;
                    cells--;
                }
            }
        }

        // increment w/ mine to right
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (board[i][j] == 8) continue;
                if (board[i][j + 1] == 8) board[i][j]++;
            }
        }
        // increment w/ mine to left
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (board[i][j] == 8) continue;
                if (board[i][j - 1] == 8) board[i][j]++;
            }
        }
        // increment w/ mine below
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 8) continue;
                if (board[i + 1][j] == 8) board[i][j]++;
            }
        }
        // increment w/ mine above
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 8) continue;
                if (board[i - 1][j] == 8) board[i][j]++;
            }
        }
        // increment w/ mine diagonal down right
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (board[i][j] == 8) continue;
                if (board[i + 1][j + 1] == 8) board[i][j]++;
            }
        }
        // increment w/ mine diagonal down left
        for (int i = 0; i < m - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (board[i][j] == 8) continue;
                if (board[i + 1][j - 1] == 8) board[i][j]++;
            }
        }
        // increment w/ mine diagonal up right
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (board[i][j] == 8) continue;
                if (board[i - 1][j + 1] == 8) board[i][j]++;
            }
        }
        // increment w/ mine diagonal up left
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (board[i][j] == 8) continue;
                if (board[i - 1][j - 1] == 8) board[i][j]++;
            }
        }

        // print updated table
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 8) System.out.print("*  ");
                else System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
