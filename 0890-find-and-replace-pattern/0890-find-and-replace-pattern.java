class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String w :words){
            if(check(w, pattern)) res.add(w);
        }
        return res;
    }

    public boolean check(String a, String b){
        for(int i=0; i<a.length(); i++){
            if(a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
        }
        return true;
    }
}