class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for(int num:nums){
            res.add(num);
        }

        int longNum=0;
        for(int num: res){
            if(!res.contains(num-1)){
                int curr=num;
                int currCount =1;

                while(res.contains(curr +1)){
                    curr++;
                    currCount++;
                }

                longNum = Math.max(longNum, currCount);
            }
        }
        return longNum;
    }
}