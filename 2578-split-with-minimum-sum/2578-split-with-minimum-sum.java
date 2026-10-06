class Solution {
    public int splitNum(int num) {
        char[] dig = String.valueOf(num).toCharArray();
        Arrays.sort(dig);

        int num1=0, num2=0;
        
        for(int i=0; i<dig.length; i++){
            if(i%2==0) num1 = num1*10+(dig[i]-'0');
            else num2 = num2*10+(dig[i]-'0');
        }
        int sum = num1+num2;
        return sum;
    }
}