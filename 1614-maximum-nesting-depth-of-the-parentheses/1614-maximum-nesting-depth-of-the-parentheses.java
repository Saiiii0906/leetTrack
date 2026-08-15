class Solution {
    public int maxDepth(String s) {
        int count=0;
        int depth=0;
        int n=s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                count++;
                if(depth<count) depth = count;
            }else if(s.charAt(i) == ')'){
                count--;
            }
        }
        return depth;
    }
}