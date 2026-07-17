class Solution {
    public int commonFactors(int a, int b) {
        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<Integer> blist = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=1; i<=a; i++){
            if(a % i ==0){
                alist.add(i);
            }
        }

        for(int i=1; i<=b; i++){
            if(b % i ==0){
                blist.add(i);
            }
        }

        HashSet<Integer> set = new HashSet<>(alist);
        int count=0;
        for(int num : blist){
            if(set.contains(num)){
                count++;
            }
        }

        return count;
    }
}