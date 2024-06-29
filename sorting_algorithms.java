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
    // merge sort
    //tc = O(nlogn)
    public static void mergesort(int arr[] , int si, int ei){
        if(si>=ei){
            return;  //base case
        }
        int mid = si +(ei-si)/2;
        mergesort(arr, si, mid); //left
        mergesort(arr, mid+1, ei); // right
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si , int mid, int ei){
        int temp [] = new int[ei-si+1];
        int i =si;
        int j =mid+1;
        int k =0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k = 0, i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    //quick sort
    public static void quickSort(int arr[] , int si , int ei){
        if(si>=ei){
            return;
        }

        int pIndx = partition(arr,si,ei);
        quickSort(arr, si, pIndx-1);
        quickSort(arr,pIndx+1,ei);
    }
    public static int partition(int arr[] , int si,int ei){
        int pivot = arr[ei];
        int i = si-1; //make space for elements smaller than the pivot to get stored
        for(int j=si;j<ei ;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }  
        }
         // for pivot
         i++;
         int temp = pivot;
         arr[ei] = arr[i];
         arr[i] = temp;
         return i;
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
        int array[] = {5,4,1,3,2,-1};
        //selection(array);
        quickSort(array, 0, array.length-1);
        display(array);
    }
}
