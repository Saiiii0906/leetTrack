class Solution {
    public boolean backspaceCompare(String s, String t) {
        int l=s.length() -1;
        int r = t.length()-1;

        while(l>=0 || r>=0){
            l = get_char_idx(s, l);
            r = get_char_idx(t, r);
            if(l<0 && r<0){
                return true;
            }
            if(l<0 || r<0){
                return false;
            }else if(s.charAt(l) != t.charAt(r)){
                return false;
            }

            l--;
            r--;
        }
        return true;
    }

    private int get_char_idx(String str, int end){
        int backcount =0;
        while(end>=0){
            if(str.charAt(end) == '#'){
                backcount++;
            }else if(backcount>0){
                backcount--;
            }else{
                break;
            }

           end--;
        }
        return end;
    }
}