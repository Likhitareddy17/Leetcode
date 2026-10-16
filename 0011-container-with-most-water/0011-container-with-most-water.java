class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int h=0,w=0;
        int area=0,maxarea=0;
        while(l<=r){
            h=Math.min(height[l],height[r]);
            w=r-l;
            area=h*w;
            maxarea=Math.max(maxarea,area);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }
}