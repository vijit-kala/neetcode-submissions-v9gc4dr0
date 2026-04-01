class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] seen;

        for(int i=0; i<9; i++) {
            seen = new boolean[9];
            for(int j=0; j<9; j++) {
                if(!check(board[i][j], seen))
                    return false;
            }
        }

        for(int j=0; j<9; j++) {
            seen = new boolean[9];
            for(int i=0; i<9; i++) {
                if(!check(board[i][j], seen))
                    return false;
            }
        }

        for(int r = 0; r<9; r+=3) {
            for(int c =0; c<9; c+=3) {
                seen = new boolean[9];
                for(int i=0;i<3; i++) {
                    for(int j=0; j<3; j++) {
                        if(!check(board[r + i][c+j], seen))
                            return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean check(char ch, boolean[] seen) {
        if(ch == '.')
            return true;
        int num = ch -'1';
        if(seen[num])
            return false;
        seen[num] = true;
        return true;
    }
}
