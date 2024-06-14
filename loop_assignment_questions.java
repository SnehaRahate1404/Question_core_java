import java.util.*;
public class loop_assignment_questions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int counter=0;
        // while(counter<=10){ //printing number 0-10
        //     System.out.print(counter+" ");
        //     counter++;
        // }
        
        // int n = sc.nextInt();
        // int count=0;
        // while(count<=n){  // printing number 0-n
        //     System.out.print(count+" ");
        //     count++;
        // }

        // // sum of n natural numbers
        // int c=0;
        // int sum =0;
        // while(c<=n){
        //     sum+=c;
        //     c++;
        // }
        // System.out.println("sum of n natural number is "+ sum);

        // //printing a square pattern
        // int line=4;
        // for(int i=0;i<line;i++){
        //     System.out.println(" * * * *");
        // }

        //printing areverse of a number
        // int no = 10899;
        // int reverse=0;
        // while(no>0){
        //     int lastdigit = no%10;
        //      reverse = (reverse*10)+lastdigit;
        //     no/=10;

        // }
        // System.out.println(reverse);

        //input a number from user until he/she enters a multiple of 10
        // do{   // use of break keyword in the loop
        //     System.out.println("enter a number");
        //     int num = sc.nextInt();
        //     if(num%10==0){
        //         break;
        //     }
        //     System.out.println(num);
        // } while(true);
        // display all numbers entered by user except multiples of 10

        // do{
        //     System.out.print("enter number");
        //     int nums = sc.nextInt();
        //     if(nums%10==0){
        //         continue;
        //     }
        //     System.out.println(nums);
        // }while(true);

        //prime number or not
        // System.out.print("enter a number to be checked");
        // int check = sc.nextInt();
        // for(int i =2;i<Math.sqrt(check);i++){
        //     if(check%i ==0){
        //         System.out.println("not a prime");
        //     } else{
        //         System.out.println("prime number");
        //     }
        // }

        //inputting a set of numbers and printing sum of even and odd numbers
        /*System.out.println("enter how many numbers you want to enter");
        int numbers = sc.nextInt();
        int evenSum=0;
        int oddSum =0;
        for(int i=0;i<numbers;i++){
           
            int num=sc.nextInt();
            if(num%2==0){
               evenSum+=num;
            }
            else{
                oddSum+=num;
            }
        }
        System.out.println("sum of even numbers is " + evenSum);
        System.out.println("sum of odd numbers is "+ oddSum);*/

        //factorial of any number inserted by user
        /* System.out.println("enter the number whose factorial you want to calculate");
        int number = sc.nextInt();
        int factorial =1;
        for(int i=1;i<=number;i++){
            factorial *=i;
        }
        System.out.println("factorial of given number is " + factorial); */
        
        //multiplication table of a given number

        System.out.println("enter the number whose multiplication table you need");
        int number = sc.nextInt();
        int product = 1;
        for(int i =1 ; i<=10;i++){
            product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }

    }
}
