class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        long total=(long) n*n;
        long sum=0, sqSum=0;

        for(int[] i: grid){
            for(int val:i){
                sum += val;
                sqSum += (long) val*val;
            }
        }

        long expSum= total * (total+1)/2;
        long expSumsq= total * (total+1) * (2*total+1)/6;

        long difSum = sum - expSum;
        long difSumsq = sqSum - expSumsq;
        long diff = difSumsq/difSum;

        long a = (difSum + diff)/2;
        long b = a - difSum;

        return new int[]{(int) a, (int) b};
    }
}