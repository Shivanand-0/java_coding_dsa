class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!isValidPosition(board,i,j)) return false;
                }
            }
        }
        return true;
    }

    public boolean isValidPosition(char[][] board, int row, int col) {
        for (int z = 0; z < 9; z++) {
            if(z==col) continue;
            if (board[row][col] == board[row][z])
                return false;
        }
        for (int z = 0; z < 9; z++) {
            if(z==row) continue;
            if (board[row][col] == board[z][col])
                return false;
        }
        int i=row,j=col;
        int xMin=0,xMax=0,yMin=0,yMax=0;
        if (i >= 0 && i <= 2) {
            if (j >= 0 && j <= 2) {
                xMin=0;
                xMax=2;
                yMin=0;
                yMax=2;
            } else if (j >= 3 && j <= 5) {
                xMin=0;
                xMax=2;
                yMin=3;
                yMax=5;
            } else if (j >= 6 && j <= 8) {
                xMin=0;
                xMax=2;
                yMin=6;
                yMax=8;
            }
        } else if (i >= 3 && i <= 5) {
            if (j >= 0 && j <= 2) {
                xMin=3;
                xMax=5;
                yMin=0;
                yMax=2;
            } else if (j >= 3 && j <= 5) {
                xMin=3;
                xMax=5;
                yMin=3;
                yMax=5;
            } else if (j >= 6 && j <= 8) {
                xMin=3;
                xMax=5;
                yMin=6;
                yMax=8;
            }
        } else if (i >= 6 && i <= 8) {
            if (j >= 0 && j <= 2) {
                xMin=6;
                xMax=8;
                yMin=0;
                yMax=2;
            } else if (j >= 3 && j <= 5) {
                xMin=6;
                xMax=8;
                yMin=3;
                yMax=5;
            } else if (j >= 6 && j <= 8) {
                xMin=6;
                xMax=8;
                yMin=6;
                yMax=8;
            }
        }
        for (int a = xMin; a <=xMax; a++) {
            for(int b=yMin;b<=yMax;b++){
                if(a==row && b==col) continue;
                if (board[row][col] == board[a][b])
                return false;
            }
        }
        return true;
    }
}