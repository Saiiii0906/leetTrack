class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
        while(n!=1 && !visited.contains(n)){
            visited.add(n);
            int sum=0;
            while(n!=0){
                int num= n%10;
                sum += num*num;
                n/=10;
            }
            n = sum;
        }

        return n==1;
    }
}