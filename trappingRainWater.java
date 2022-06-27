public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        long watertrapped=0;
        for(int i=0;i<n;i++){
            int j=i;
            long leftMax=0, rightMax=0;
            while(j>=0){
                leftMax=Math.max(leftMax,arr[j]);
                j--;
            }
            j=i;
            while(j<n){
                rightMax=Math.max(rightMax,arr[j]);
                j++;
            }
            watertrapped+=Math.min(leftMax,rightMax)-arr[i];
            
        }
        return watertrapped;
    }
}