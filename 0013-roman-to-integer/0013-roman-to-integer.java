class Solution {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        for(int i=0; i<s.length()-1; i++){
            if(romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1))){
                res -= romanValues.get(s.charAt(i));
            }else{
                res += romanValues.get(s.charAt(i));
            }
        }

        return res + romanValues.get(s.charAt(s.length()-1));
    }
}