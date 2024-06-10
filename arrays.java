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
    public static void main (String args[]){
        int array[] = {11,2,3,34,5,6,7,8,78,0};
        int array2[]={1,2,3,4,5,6,7,8,9};
        int key = 6;
        System.out.print(" the index of the key is " );
        System.out.println(linear_Search(key, array));
        System.out.println(largest(array));
       System.out.println(binary(array2, key));
        reverse(array2);
        for(int i =0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
    }
}
