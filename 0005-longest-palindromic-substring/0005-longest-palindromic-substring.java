class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1){
            return s;
        }

        int maxLen =1;
        String maxStr = s.substring(0,1);
        for(int i=0; i<n; i++){
            for(int j=i+maxLen; j<=n; j++){
                if(j-i > maxLen && isPalindrome(s.substring(i,j))){
                    maxLen = j-i;
                    maxStr = s.substring(i,j);
                    }
            }
        }

        return maxStr;
    }

    private boolean isPalindrome(String str){
        int l = 0;
        int r = str.length() -1;

        while(l<r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}