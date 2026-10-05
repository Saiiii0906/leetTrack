class Solution {
    public int scoreOfParentheses(String s) {
        return res(s,0, s.length()-1);
    }

    static int res(String s, int l, int r){
        if(l+1 == r)return 1;

        int count=0;
        for(int i=l; i<=r;i++){
            if(s.charAt(i) == '('){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                if(i==r){
                    return 2*res(s, l+1, r-1);
                }else{
                    return res(s,l,i)+res(s,i+1,r);
                }
            }
        }
        return 0;
    }
}