class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int dep=0;
        for(char c: s.toCharArray()){
            if(c == '('){
                if(dep>0) sb.append(c);
                dep++;
            }else{
                dep--;
                if(dep>0) sb.append(c);
            }
        }

        return sb.toString();
    }
}