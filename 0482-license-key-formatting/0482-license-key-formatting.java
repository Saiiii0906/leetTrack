class Solution {
    public String licenseKeyFormatting(String s, int k) {
       int i=0;
       String ans="";
       if(s.length()==1){
        if(s.charAt(0)=='-'){
        return ans;
        }
       }
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
        while(i<s.length() && s.charAt(i)=='-'){
                i++;
            }
            if(i<s.length()){
                    sb.append(s.charAt(i));
                    i++;
                    
            }
            
        }
       sb = new StringBuilder(sb.toString().toUpperCase());
     int times =0;
    for(int j=sb.length()-1;j>=0;j--){
     if(times<k && j>0){
           times++;
     }
        if(times==k){
      sb.insert(j,'-');
        times=0;
        }
    }
    ans = sb.toString();
    return ans;
    }
}