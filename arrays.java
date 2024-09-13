public class arrays{
  
  //linear search in array time complexity is O(n);
  public static int linearSearch(int nums[] , int key ){
    for(int i =0 ; i<nums.length ; i++){
      if(nums[i] == key){
        return i;
      }
    }
    return -1;
  }

  //largest element in an array time complexity is O(n);
  public static int largestElement(int nums[]){
    int max = Integer.MIN_VALUE;
    for(int i =0 ; i<nums.length ;i++){
      max = Math.max(max , nums[i]);

    }
    return max;
  }

  //binary search in array given array is sorted time complexity O(logn)
  public static int binarySearch(int nums[] , int key){
    int start = 0;
    int end = nums.length-1;
    while(start <= end){
      int mid =(start+end)/2;
      if(nums[mid] == key){
       return mid;
      }
       if(nums[mid] < key){
        start = mid+1;
      }else{
        end = mid-1;
      }
    }
    return -1;
  }
 
  //reverse an array time complexity = O(n) space complexity = O(1)
  public static void reverseArray(int nums[]){
    int start = 0;
    int end = nums.length-1;
    while(start <= end){
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    } 
  }

  //display array
  public static void display(int array[]){
    for(int i =0 ; i< array.length ;i++){
      System.out.print(array[i]+" ");
    }
   
  }

  //pairs in array (total number of possible pair) time complexity = O(n^2)
  public static void pairsArray(int array[]){
      for(int i =0 ; i<array.length ;i++){
        int curr = array[i];
        for(int j = i+1; j<array.length ; j++){
          System.out.print("(" + curr +"," +array[j]+")");
        }
        System.out.println();
      }
  }

  //printing subarrays (continous part of array) time complexity = O(n^3)
  public static void subarray(int array[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i =0 ; i<array.length;i++){
      int start = i;
      for(int j =i+1; j<array.length;j++){
        int end = j;
        for(int k = start ; k<=end;k++){
          currSum+=array[k];
        }
        if(currSum>maxSum){
          maxSum=currSum;
        }
        currSum=0;
      }
    }
    System.out.println(maxSum);
  }

  //calculating maxsum of subarrays using prefix sum method time complexity = O(n^2)
  public static int prefixsum(int array[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefixSum[] = new int[array.length];
    prefixSum[0]=array[0];
    for(int i = 1; i<array.length ; i++){
        prefixSum[i]=prefixSum[i-1]+array[i];
    }
    for(int i =0 ; i<array.length ; i++){
      int start = i;
      for(int j = i+1 ; j<array.length ; j++){
        int end = j;
        currSum = start ==0 ? prefixSum[end] : prefixSum[end]-prefixSum[start-1];
        if(maxSum < currSum){
          maxSum=currSum;
        }
      }
    }
    return maxSum;
  }
   
  //kadane's algorithm time complexity O(n)
  public static void kadane(int array[]){
     int maxSum = Integer.MIN_VALUE;
     int currSum = 0;
     int count = 0;
     for(int i =0 ; i<array.length ; i++){
        if(array[i] < 0){
           count++;
        }
     }
     if(count == array.length){
       for(int i =0 ; i<array.length ;i++){
          if(maxSum < array[i]){
            maxSum = array[i];
          }
       }
       System.out.println(maxSum);
     }
     else{
      for(int i =0 ; i<array.length ; i++){
        currSum+=array[i];
        if(currSum < 0){
          currSum =0;
        }
        if(maxSum < currSum){
          maxSum= currSum;
        }
     }
     System.out.println(maxSum);
     } 
  }
  public static void main(String args[]){
       int array[] = {-2,-3,-4,-1,-5};
      //  System.out.println(linearSearch(array, 6));
      //  System.out.println(largestElement(array));
      //  System.out.println(binarySearch(array, 3));
      //  pairsArray(array);
      //subarray(array);
      //  reverseArray(array);
      //  display(array);
      kadane(array);
      System.out.println(prefixsum(array));
       
  }  
}