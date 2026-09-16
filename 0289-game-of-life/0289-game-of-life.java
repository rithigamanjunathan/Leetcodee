class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = board[i][j];
            }
        }

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {

                int count = 0;

    
                for (int i = r - 1; i <= r + 1; i++) {
                 for (int j = c - 1; j <= c + 1; j++) {
                        if (i >= 0 && i < m && j >= 0 && j < n) {
                        if (!(i == r && j == c)) {
                            if (a[i][j] == 1)
                            count+=a[i][j];
                        }
                        } 
                    }
                }
                if (a[r][c] == 1) {
                    if (count < 2 || count > 3) {
                        board[r][c] = 0;
                    }
                }
                else {
                    if (count == 3) {
                        board[r][c] = 1;
                    }
                }
            }
        }
    }}