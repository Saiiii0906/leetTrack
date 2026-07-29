class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum=0;
        if(coordinates.charAt(0) == 'a' || coordinates.charAt(0) == 'c' || coordinates.charAt(0) == 'e' || coordinates.charAt(0) == 'g') sum++;

        if(coordinates.charAt(1) == '1' || coordinates.charAt(1) == '3' || coordinates.charAt(1) == '5' || coordinates.charAt(1) == '7') sum++;

        if(sum%2!=0) return true;
        else return false;
    }
}