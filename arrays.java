public class arrays {
    //linerar search
    public static int linear_Search(int key , int array[]){
          for(int i =0 ; i < array.length ; i ++){
            if(array[i] == key){
                return i;
            }
          }
          return -1;
    }

    //largest number in an array
    public static int largest(int array[]){
        int minimum = Integer.MIN_VALUE;
        for(int i =0 ; i < array.length ; i++){
             if(minimum < array[i]){
                minimum = array[i];
             }
        }
        return minimum;
    }

    //binaary search algorithm 

    public static int binary(int array[] , int key){
          int start = 0;
          int end = array.length-1;
          while(start<=end){
              int mid_value = (int)(start+end)/2;
              if(array[mid_value]==key){
                return mid_value;
              }
              if(array[mid_value]< key){
                start = start+1;
              }
              else{
                end=end-1;
              }
          }
          return -1;
    }

    // reverse an array
    public static void reverse(int array[]){
        int first =0;
        int last = array.length-1;
        while(first<last){
            int temp = array[first];
            array[first] = array[last];
            array[last]=temp;
           first++;
           last--;
        }
    }

    // pairs in array 

    public static void pairs(int array[]){
      int ts = 0;
      for(int i=0;i<array.length;i++){
        int curr = array[i];
        
        for(int j = i+1 ; j<array.length;j++){
            System.out.println("(" + curr + " "+ array[j] + ")");
            ts++;
        }
        System.out.println(" ");
        
      }
      System.out.println("total number of pairs = " + ts);
    }

    // subarrays of the array

    public static void subarrays(int array[]){
      for(int i = 0; i<array.length ;i++){
        int start = i;
        for(int j = i;j<array.length;j++){
          int end = j;
          for(int k = start ; k<=end ; k++){
            System.out.print(array[k] + " ");
          }
          System.out.println();
        }

      }
    }

    // maximum subarray sum

    public static void maxsubarraySum(int array[]){
      int currSum = 0;
      int max = Integer.MIN_VALUE;
      for(int i =0 ; i< array.length ; i++){
        for(int j =i;j<array.length;j++){
          currSum = 0;
          for(int k = i ; k<=j;k++){
            currSum += array[k];
          }
          System.out.println(currSum);
          if(max<currSum){
            max = currSum;
          }
        }
      }
      System.out.println("maximum subarray sum is " + max);
    }

    // claculating max subarray sum using prefix method

    public static void prefixSum(int array[]){
      int currSum=0;
      int max=Integer.MIN_VALUE;
      int prefix[] = new int[array.length];
      prefix[0] = array[0];
       // calculating prefix sum array
       for(int i=1;i<array.length;i++){
        prefix[i]=prefix[i-1]+array[i];
       }

       //calculating max sum 

       for(int i=0;i<array.length;i++){
        int start =i;
        for(int j=i;j<array.length;j++){
          int end =j;
          currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
          if(max<currSum){
            max=currSum;
          }
        }
       }
       System.out.println("maximum sum is "+ max);
    }

    //kadane's algorithm for calculating the maxsubarray sum

    public static void maxsum(int array[]){
      int currSum=0;
      int maxsum=Integer.MIN_VALUE;
      for(int i=0;i<array.length;i++){
        currSum+=array[i];
        if(currSum<0){
          currSum=0;
        }
       maxsum=Math.max(currSum,maxsum);
      }
      System.out.println("max sum is" +maxsum);
    }
    public static void main (String args[]){
        int array[] = {11,2,3,34,5,6,7,8,78,0};
        int array2[]={1,2,3,4,5,6,7,8,9};
        int array3[] = {1,-2,6,-1,3};
        int key = 6;
        System.out.print(" the index of the key is " );
        System.out.println(linear_Search(key, array));
        System.out.println(largest(array));
       System.out.println(binary(array2, key));
        //reverse(array2);
        for(int i =0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        //pairs(array2);
        subarrays(array2);
        maxsubarraySum(array3);
        prefixSum(array3);
        maxsum(array3);
    }
}
