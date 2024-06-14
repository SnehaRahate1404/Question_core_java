public class trapping_rainwater_prblm {

    public static int trappedWater(int array[]){
        int waterTrapped = 0;
        //calculate the leftmax array 
        int leftMax[] = new int[array.length];
        leftMax[0]=array[0];
        for(int i =1;i<array.length;i++ ){
            leftMax[i] = Math.max(array[i],leftMax[i-1]);
        }

        //calculating rightMax
        int rightMax[]=new int[array.length];
        rightMax[array.length-1]=array[array.length-1];
        for(int i= array.length-2;i>=0;i--){
            rightMax [i] = Math.max(array[i],rightMax[i+1]);
        }

        //loop 
        for(int i=0;i<array.length;i++){
            //calculating water level
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //calculating total rainwater trapped
            waterTrapped += (waterLevel-array[i]) * 1;

        }

        return waterTrapped;
    }
    public static void main(String args[]){

        int height[]={4,2,0,6,3,2,5};
        System.out.println("amount water trapped between the bars is " + trappedWater(height));
    }
}
