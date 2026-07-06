class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String ans = "aeiouAEIOU";
        int count1=0;
        int count2=0;

        for(int i=0; i<n/2; i++){
            if(ans.indexOf(s.charAt(i)) != -1){
                count1++;
            }
        }

        for(int i=n/2; i<n; i++){
            if(ans.indexOf(s.charAt(i)) != -1){
                count2++;
            }
        }

        if(count1 == count2) return true;
        else return false;
    }
}