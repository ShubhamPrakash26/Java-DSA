public class TrappingRainWater{

    public static int trappedRainwater(int height[]){
        int n = height.length;
        //Calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        //Calculate Right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        int trappedWater = 0;
        //loop to calculate trapped water
        for(int i=0;i<n;i++){
            
            //Waterlevel = min(rightmax boundary, leftmax boundary) for a bar
            int waterlevel = Math.min(rightMax[i],leftMax[i]);

            //trappedwater = waterlevel - height of current bar
            trappedWater+= waterlevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}

//Most Optimised
class Solution {
    public int trap(int[] height) {
        int sum = 0;
        
        int left = 0;
        int right = height.length -1;
        int lMax = 0;
        int rMax = 0;
        
        while (left < right){
            if (height[left] < height[right]){
                if (height[left] > lMax){
                    lMax = height[left];
                } 
                else{
                    sum += lMax - height[left];
                }
                left++;    
            }
            else{
                if (height[right] > rMax){
                    rMax = height[right];
                }
                else{
                    sum += rMax - height[right];
                }
                right--;
            }
        }
            
        
        return sum;
    }
}

