class Solution {
    public int maxSubarray(int[] nums) {
        int n=nums.length;
        int l=0;
        int max=0;
        int[] freq = new int[501];
        for(int i=0; i<n; i++){
            freq[nums[i]]++;
            while(!condition(freq)){
                freq[nums[l]]--;
                l++;
            }
            max = Math.max(max, i-l+1);
        }
        return max;
    }

    public boolean condition(int[] freq){
        List<Integer> curr = new ArrayList<>();
        for(int i=0; i<=500; i++){
            if(freq[i]>0){
                curr.add(i);
            }
        }

        int s=curr.size();
        for(int i=0; i<s; i++){
            int a = curr.get(i);
            for(int j=i; j<s; j++){
                int b=curr.get(j);
                int sum=a+b;

                if(sum<=500 && freq[sum]>0){
                    if(a==b && freq[a]<2){
                        continue;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}