class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxwater = 0;
        int lb = 0, rb = height.size() - 1;
        while(lb < rb){
            int w = rb - lb;
            int h = min(height[lb], height[rb]);
            int currwater = w*h;
            maxwater = max(maxwater, currwater);
            height[lb] < height[rb] ? lb++ : rb--;
        }
        return maxwater;
    }
};