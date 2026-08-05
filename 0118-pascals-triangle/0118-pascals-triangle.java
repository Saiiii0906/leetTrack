class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
           List<Integer> tmp= new ArrayList<>(i+1);
           for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    tmp.add(1);
                }else{
                    int left=ans.get(i-1).get(j-1);
                    int right=ans.get(i-1).get(j);
                    tmp.add(left + right);
                }
           }
           ans.add(tmp);
        }
       return ans;
    }
}