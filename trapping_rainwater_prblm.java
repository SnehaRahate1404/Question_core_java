public class trapping_rainwater_prblm {

    public static int trappedwater(int array[]){

        int n = array.length;
        //calculate leftmax
        int leftmax[] = new int[n];
        leftmax[0] = array[0];
        for(int i =1 ; i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1] , array[i]);
        }
        //calculate rightmax
        int rightmax[] = new int[n];
        rightmax[n-1] = array[n-1];
        for(int i =n-2 ; i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1] , array[i]);
        }
        //loop to calculate waterlevel and trapped water
        int trapped = 0;
        for(int i =0 ; i<n;i++){
            int waterlevel= Math.min(leftmax[i],rightmax[i]);
            trapped+=waterlevel-array[i];
        }

        return trapped;
    }
    public static void main(String args[]){

        int height[]={4,2,0,6,3,2,5};
        System.out.println("amount water trapped between the bars is " + trappedwater(height));
    }
}
