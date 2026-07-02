class Solution {
    public int numberOfSubstrings(String s) {
        int lasta=-1, lastb=-1, lastc=-1;
        int n=s.length();
        int count=0;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='a') lasta=i;
            else if(ch=='b') lastb=i;
            else if(ch=='c') lastc=i;


            if(lasta != -1 && lastb != -1 && lastc != -1){
                count += Math.min(lasta, Math.min(lastb, lastc))+1;
            }
        }

        return count;
        // for(int i=0; i<n; i++){
        //     char freq = [0 ,0 ,0 ];
        //     for(int j=i; j<n-1; j++){
        //         freq[s.charCodeAt(j) - 97]++;
        //         if(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}