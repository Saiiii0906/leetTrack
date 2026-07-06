class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String count1="";
        String count2="";
        for(int i=0; i<word1.length; i++){
            count1+=word1[i];
        }

        for(int i=0; i<word2.length; i++){
           count2+=word2[i];
        }

        if(count1.equals(count2)) return true;
        return false;
    }
}