class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();

        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        solve(0 , board , ans , n);
        return ans;
    }
    void solve(int col , char board[][] , List<List<String>> ans ,int n){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;

        }

        for(int row=0;row<n;row++){
            if (correct(row , col , board , n)){
                board[row][col]='Q';

                solve(col+1 , board , ans , n);

                board[row][col]='.';
            }
        }
    }

    boolean correct(int row , int col , char board[][] , int n){
        int duprow=row;
        int dupcol=col;

        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }

        row=duprow;
        col=dupcol;

        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }

        row=duprow;
        col=dupcol;

        while(row <n && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }

        return true;


    }


}