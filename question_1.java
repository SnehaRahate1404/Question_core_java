//swaping of two numbers

import java.util.*;
public class question_1{
      //method for swapping the numbers
      public static void swap(int num1 , int num2){
        int temp = num1 ;                          //creating a temporary variable for storing the number
        num1 = num2;
        num2=temp;
        System.out.println("swapped numbers are:-");
        System.out.println("num1 = "+num1);
        System.err.println("num2 ="+num2);
      }
      public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the first number");
           int x = sc.nextInt();
           System.out.println("enter the second number");
           int y = sc.nextInt();
           System.out.println("previous input is as follows : -");
           System.out.println("num1 = "+x);
           System.out.println("num2 = "+y);
           swap(x,y);                            //method calling
           
      }
}