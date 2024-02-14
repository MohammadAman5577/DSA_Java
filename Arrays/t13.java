// Trapped Rainwater 
// Auxillary array = Helper array

package Arrays;

public class t13 {
    public static int trappedRainwater(int height[]){
        int n = height.length;
        
        // calculate left max boundary - array    (Auxillary array)
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1 ; i<n ; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }

        // calculate right max boundary - array    (Auxillary array) 
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1]; // means last building ke liye
        for (int i=n-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0 ;
        //loop
        for(int i=0; i<n; i++){
            // waterLevel=min(leftmax bound - rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            
             //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
           
    }


    public static void main (String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println( trappedRainwater(height));
        
    }

}