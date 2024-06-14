import java.util.*;
public class conditional_statement_assignment{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //checking  number positive or negative
        System.out.println("Input a number to check whether positive or negative");
        int number=sc.nextInt();
        if(number<0){
            System.out.println("negative number");
        } else{
            System.out.println("positive number");
        }
        // checking whether the person have fever or not
        double temp =103.5;
        if(temp<100){
            System.out.println("you don't have fever");
        } else{
            System.out.println("you have fever");
        }
        //printing the days of the week
        System.out.println("enter the number from (1-7) to check which week day it is");
        int day = sc.nextInt();
        switch(day){
            case 1:System.out.println("monday");
                    break;
            case 2:System.out.println("tuesday");
                    break;
            case 3:System.out.println("wednesday");
                    break; 
            case 4:System.out.println("thursday");
                    break;
            case 5:System.out.println("friday");
                    break;
            case 6:System.out.println("saturday");
                    break;  
            case 7:System.out.println("sunday");
                    break;   
            default : System.out.println("you entered wrong input");  
        }


     }
}