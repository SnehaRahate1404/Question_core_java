import java.util.*;
public class leetcode {
    //leetcode array question 1929 concatenation of array

    public static int[] concatenate(int array[]){
        int n = array.length;
        int result[] = new int[2*n];
        for(int i =0;i<n;i++){
            result[i]=array[i];
            result[i+n]=array[i];
        }

        return result;
    }

    //leetcode array question 1920 build array from permutation
    public static int[] buildArray(int array[]){
        int n = array.length;
        int ans[] = new int[n];
        for(int i =0;i<n;i++){
            ans[i]=array[array[i]];
        }
        return ans;
    }

    //leetcode array question 1512 number of good pairs

    public static int numIdenticalPairs(int nums[]){
        int n =0;
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    n++;
                }
            }
        }
        return n;
    }

    //leetcode array question 2011 find value of variable after performing operations
    public static int finalValueAfterOperation(String operations[]){
        int n =0;
        int x = 0;
        int z =0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--x") || operations[i].equals("x--")){
                --x;
            }
            else if(operations[i].equals("++x") || operations[i].equals("x++")){
                ++z;
            }
        }
        n = x+z;
        return n;
    }

    //leetcode array question 1480 running sum of 1d array

    public static int[] runningSum(int nums[]){
        int [] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i =1;i<nums.length;i++){
            runningSum[i]=runningSum[i-1] + nums[i];
        }
        return runningSum;
    }

    //score of a string leetcode question 3110

    public static int score(String s){
        int score =0;
        for(int i=0;i<s.length()-1;i++){
            int val = Math.abs((int)(s.charAt(i+1)-s.charAt(i)));
            score+=val;
        }
        return score;
    }

    //leetcode question 2798 number of employees who met the target

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
       for(int i =0;i<hours.length;i++){
           if(hours[i]>=target){
               count++;
           }
       }
       return count;
   }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            target[index[i]]= nums[i];
        }
        return target;
     }

     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one = "";
        String two="";
        for(int i=0;i<word1.length;i++){
            one+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            two+=word2[i];
        }

        if(one == two){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int array[]={1,1,1,1};
        String operations [] = {"--x","x++","x++"};
        int nums[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};
        //System.out.println(Arrays.toString(buildArray(array)));
       // System.out.println(numIdenticalPairs(array));
        //System.out.println(finalValueAfterOperation(operations));
        // String val = "hello";
        // int score =0;
        // for(int i =0;i<val.length()-1;i++){
        //     int num =Math.abs((int)(val.charAt(i+1)-val.charAt(i)));
        //     score+=num;
        // }
        // System.out.println(score);
        //System.out.println(score("hello"));
        System.out.println(createTargetArray(nums,index));
        String input1 [] ={"a" ,"bc"};
        String input2 [] ={"ab" ,"bc"};
        String ans = "";
        

    }
}
