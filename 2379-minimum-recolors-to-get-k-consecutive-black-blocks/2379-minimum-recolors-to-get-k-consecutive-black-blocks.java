class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min =0;
        int w=0;
        for(int i=0; i<k; i++){
            if(blocks.charAt(i) == 'W'){
                w += 1;
            }
        }


        min = w;
        for(int i=k; i<blocks.length(); i++){
            if(blocks.charAt(i) == 'W'){
                w+=1;
            }

            if(blocks.charAt(i-k) == 'W'){
                w-=1;
            }

            min = Math.min(min,w);
        }

        return min;
    }
}