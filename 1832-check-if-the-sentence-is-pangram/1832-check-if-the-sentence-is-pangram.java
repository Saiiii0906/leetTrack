class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;

        boolean[] arr = new boolean[26];
        for(char c:sentence.toCharArray()){
            if(c>='a' || c<='z'){
                arr[c-'a'] =true;
            }
        }

        for(boolean b:arr){
            if(!b) return false;
        }
        return true;
    }
}