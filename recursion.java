public class recursion {

    //printing a number from n to 1
    public static void print(int n){
       if(n == 1){
        System.out.println("1");
        return;
       }
       System.out.println(n);
       print(n-1);
    }

    //printing numbers from 1 to n
    public static void printn(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
       printn(n-1);
       System.out.println(n);
    }

    //factorial of number n
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fac = factorial(n-1);
        int fn = n * factorial(n-1);
        return fn;
        
    }

    //sum of n natural numbers
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int initialsum = sum(n-1);
        int sum = n+ initialsum;
        return sum;
    }

    //print nth fibonacci number
    public static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int number = fibnm1+fibnm2;

        return number;
    }

    //check whether array is sorted or not
    public static boolean isSorted(int [] arr , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
             return false;
         }
        return isSorted(arr,i+1);
        //tc = o(n)
        //sc = o(n)
    }

    //waf to find the first occurence of an element in an array

    public static int firstOccurence(int array[] , int key,int i){
        if(i == array.length){
            return -1;
        }
        if(array[i] == key){
           return i;
        }

        return firstOccurence(array, key, i+1);
        //tc = o(n)
        //sc = o(n)
    }

    //waf to find the last occurence of an element in the array
    public static int lastOcurrence(int array[],int key,int i){
         if(i==array.length){
            return -1;
         }
         int isFound= lastOcurrence(array, key, i+1);
         if(isFound == -1 && array[i]==key ){
            return i;
         }
         return isFound;
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
         int ans = power(x, n-1);
         int an = x * ans;
         return an;
    }

    public static int optimizedpower(int x, int n){
        if(n==0){
            return 1;
        }
        int half= optimizedpower(x, n/2);
        int ans =   half * half;

        if(n%2 != 0){
            ans = x * ans;
        }
        return ans;
    }
    //tiling problem
    public static int tilingProblem(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int verticalTiling = tilingProblem(n-1);
        int horizontalTiling = tilingProblem(n-2);
        int totalWays = verticalTiling + horizontalTiling;
        return totalWays;
    }
    //removing duplicates 
    public static void removeDuplicates(String str , int indx , StringBuilder newString , boolean Track[]){
        if( indx == str.length()){
            System.out.println(newString);
            return;
        }

        //kaam 
        char currChar = str.charAt(indx);
        if(Track[currChar - 'a'] == true){
            // duplicates removal by without adding it to the newString
            removeDuplicates(str, indx+1, newString, Track);
        }else{
            Track[currChar-'a'] = true;
            removeDuplicates(str, indx+1, newString.append(currChar), Track);
        }
    }
    //friends pairing problem
    public static int friendPairing(int n){
        if(n == 1 || n ==2){
            return n;
        }
        //kaam
        int single = friendPairing(n-1);
        int pair = (n-1)* friendPairing(n-2);
        int totalWays = single + pair;
        return totalWays;
    }
    public static void main(String args[]){
         int n =5;
         int arr []={1,4,6,4,5};
        //  System.out.println(fib(n));
        //  System.out.println(isSorted(arr, 0));
        //  System.out.println(firstOccurence(arr, 4, 0));
        //  System.out.println(lastOcurrence(arr, 4, 0));
        //System.out.println(optimizedpower(2, 10));
        String str = "appnnacollege";
        //removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(friendPairing(3));
    }
}
