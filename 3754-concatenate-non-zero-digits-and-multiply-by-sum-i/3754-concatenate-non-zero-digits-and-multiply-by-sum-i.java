class Solution {
    public long sumAndMultiply(int n) {
        String s = ""+n;
        long sum=0;
        long res=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                sb.append(s.charAt(i));
            }
        }
        String str =sb.toString();
        if(str.isEmpty()){
            return 0;
        }
        long num = Long.parseLong(str);
        long ans = num; 
        while(num!=0){
            long ld = num%10;
            sum+=ld;
            num=num/10;
        }
        res=ans*sum;
        return res;
    }
}