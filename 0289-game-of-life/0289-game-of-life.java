class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int count0=0;
        int count1=0;
        int[] dr={-1,-1,0,1,1,1,0,-1};
        int[] dc={0,1,1,1,0,-1,-1,-1};
        int[][] copy= new int[n][m];
        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                copy[i][j]=board[i][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(copy[i][j]==0){
                    count0=0;
                    for(int k=0; k<8; k++){
                        int nr=i+dr[k];
                        int nc=j+dc[k];
                        if(nr>=0 && nr<n && nc>=0 && nc<m){
                            if(copy[nr][nc] == 1){
                                count0++;
                            }
                        }
                    }
                    if(count0==3){
                        board[i][j] = 1;
                    }
                }else if(copy[i][j] == 1){
                    count1=0;
                    for(int k=0; k<8; k++){
                        int nr=i+dr[k];
                        int nc=j+dc[k];
                        if(nr>=0 && nr<n && nc>=0 && nc<m){
                            if(copy[nr][nc] == 1){
                                count1++;
                            }
                        }
                    }

                    if(count1<2 || count1>3){
                        board[i][j]=0;
                    }
                }
            }
        }
    }
}