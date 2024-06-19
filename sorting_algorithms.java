public class sorting_algorithms {
    // bubble sort algorithm
    public static void bubblesort(int array[]){
         for(int i =0;i<array.length-1;i++){
            int swap = 0;
            for(int j=0;j<array.length-1-i;j++ ){
                if(array[j]>array[j+1] && swap>=0){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap++;
                }
            }
         }
    }

    //selection sort
    public static void selection(int array[]){
        for(int i =0;i< array.length - 1 ;i++){
            int minPosition = i;
            for(int j=i+1 ;j<array.length;j++){
                if(array[minPosition]>array[j]){
                    minPosition = j;
                }
            }
            int temp = array[minPosition];
            array[minPosition]=array[i];
            array[i]=temp;
        }
    }
    // display the array
    public static void display(int array[]){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[] = {5,4,1,3,2};
        selection(array);
        display(array);
    }
}
