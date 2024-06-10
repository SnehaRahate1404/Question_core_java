public class functions {

    //function to return hello world
    public static void printHelloWorld(){ //function declaration
        System.out.println("hello world");  // function definition
    } 

    //functions to calculate sum
    public static int sum(int num1 , int num2){ //parameters or formal parameters
        int sum = num1+num2;
        return sum;
    }
    //product of two numbers
    public static int product(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    //factorial of any number

    public static int factorial(int num1){
        int factorial = 1;
        for(int i = 1 ;i <=num1;i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    //calculating the binomial coefficient 

    public static int binomialCoefficient(int n , int r){
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        for(int i = 1 ;i <=n;i++){
            num1 = num1* i;
        }
        for(int i = 1 ;i <=r;i++){
            num2 = num2 * i;
        }
        for(int i = 1 ;i <=(n-r);i++){
            num3 = num3 * i;
        }

        int binomialCoefficient = num1/(num2*num3);
        return binomialCoefficient;

    }
    //check whether prime or not
    public static boolean prime(int num1){
        for(int i =2;i<num1;i++){
            if(num1%i ==0){
                return false;    
            }  
        }
        return true;
    }
    //optimized method for finding prime
    public static boolean optimizedPrime(int num1){
         for(int i=2;i<Math.sqrt(num1);i++){
            if(num1% i ==0){
               return false;
            }
         }
         return true;
    }
    //print all primes in a given range
    public static void primeNumberRange(int num1){
        for(int i=2;i<num1;i++){
            prime(i);
            if(prime(i)==true){
                System.out.print(i);
            }
        }
        System.out.println();
    }
    //binary to decimal conversion
    public static void binary(int binNum){
        int myNum = binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit = binNum%10; // last digit calculation
            decNum = decNum + (lastDigit *(int) Math.pow(2,pow));
            pow++;
            binNum=binNum/10; 
        }
        System.out.println("decimal form of " + myNum + " is = " +decNum);
    }

    // conersion of decimal to binary
    public static void decimal(int decNum){
        int pow =0;
        int binNum =0;
        while(decNum>0){
           int rem = decNum%2; 
           binNum = binNum + ( rem * (int)Math.pow(10,pow));
           pow++;
           decNum = decNum /2;
        }
        System.out.println(" Binary form of the given decimal is " + binNum);
    }

    // average of three numbers

    public static void avg(int num1 , int num2 , int num3){
        int avg = (num1 +num2+num3)/3;
        System.out.println(" Average of three numbers = " + avg);
    }

    // even or odd number
    public static boolean isEven(int num){
        if(num % 2 ==0 ){
            return true;
        }
        else{
            return false;
        }
    }

    // check palindrome or not 

    public static boolean isPalindrome( int number){
        int myNum = number;
        int newNum =0;
        while(number > 0){
          int digit = number%10 ;
          newNum = newNum * 10  + digit;
          number = number/10;   
        }
        if( newNum == myNum ){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
       printHelloWorld(); // function calling 
       int sum = sum(2, 3); // arguments or actual parameters
       System.out.println("sum of numbers is " + sum);
       int product = product(3,4);
       System.out.println("product of two numbers is " + product);
       int factorial = factorial(4);
       System.out.println("factorial of the given number is " + factorial);
       int binomial = binomialCoefficient(5, 2);
       System.out.println("binomial coefficient is "+ binomial);
       System.out.println(prime(10));
       System.out.println(optimizedPrime(11));
       primeNumberRange(10);
       binary(101);
       decimal(5);
       avg(5, 5, 5);
       System.out.println(isEven(3));
       System.out.println(isPalindrome(121));

    }
}
