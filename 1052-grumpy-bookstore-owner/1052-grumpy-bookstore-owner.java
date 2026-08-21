class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int satisfied = 0;
        int window=0;
        for(int i=0; i<customers.length; i++){
            if(grumpy[i] == 0){
                satisfied += customers[i];
            }else if(i<minutes){
                window += customers[i];
            }
        }

        int maxWin = window;

        for(int i=minutes; i<customers.length; i++){
            if(grumpy[i] == 1){
                window += customers[i];
            }
            
            if(grumpy[i-minutes] == 1){
                window -= customers[i-minutes];
            }

            maxWin = Math.max(maxWin, window);
        }

        return satisfied + maxWin;

    }
}