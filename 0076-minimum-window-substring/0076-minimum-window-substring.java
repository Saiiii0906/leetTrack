class Solution {
    public String minWindow(String s, String t) {
        if(s==null || t==null || s.length()==0 || t.length()==0 || s.length()<t.length()){
            return "";
        }

        int[] map = new int[128];
        int l=0, r=0, minLen=Integer.MAX_VALUE, idx=0;
        int count=t.length();

        for(char c: t.toCharArray()){
            map[c]++;
        }

        char[] Scharacter = s.toCharArray();

        while(r<Scharacter.length){
            if(map[Scharacter[r++]]-->0) count--;

            while(count==0){
                if(r-l<minLen){
                    idx = l;
                    minLen = r-l;
                }
                
                map[Scharacter[l]]++;
                if(map[Scharacter[l]] > 0){
                    count++;
                }
                l++;
            }
        }

        return minLen==Integer.MAX_VALUE ? "" : new String(Scharacter, idx, minLen);
    }
}