class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n=img.length;
        int m=img[0].length;
        int avg=0;

        int[][] res = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int sum=0;
                int count=0;

                for(int r=-1; r<=1; r++){
                    for(int c=-1; c<=1; c++){
                        int nr = i+r;
                        int nc = j+c;

                        if(nr>=0 && nr<n && nc>=0 && nc<m){
                            sum+=img[nr][nc];
                            count++;
                        }
                    }
                }

                res[i][j] = sum/count;
            }
        }

        return res;
    }
}