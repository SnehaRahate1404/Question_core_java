import java.util.*;
public class patterns{
    //sqaure star pattern
    public static void sqaure(int rows , int columns){
        for(int i =0;i<rows;i++){
            for(int j =0; j<  columns ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*  ouput of above function
    enter number of rows and columns
    5
    5
    *****
    *****
    *****
    *****
    ***** */
    // bottom left triangle
    public static void bottomLeft(int r , int c){
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(i>=j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    /* output of above method
         *
         * *
         * * *
    */

    //top left triangle
    public static void topLeft(int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i+j<r){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /*  output of above code
      enter number of rows and columns
       5
       5
       * * * * * 
       * * * *
       * * *
       * *
       *
    */

    // top right triangle
    public static void topRight(int r , int c){
        for(int i =1;i<=r;i++){
            for(int j =1;j<=c;j++){
               if(i>=j){
                System.out.print("*");
               } else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
    // enter number of rows and columns
    // 4
    // 4
    // *
    // **
    // ***
    // ****
 
    public static void bottomRight(int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i<=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void bottomRightsecond(int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j-i>=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // enter number of rows and columns
    // 4
    // 4
    // ****
    //  ***
    //   **
    //    *

    public static void X_pattern(int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i-j ==0 || i+j == r-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // enter number of rows and columns
    // 4
    // 4
    // *   *
    //  * *
    //  * *
    // *   *
    
    // count pattern
    public static void count(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i>=j){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    // enter number of rows and columns
    // 4
    // 4
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4

    public static void countrows(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i>=j){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
    // enter number of rows and columns
    // 4
    // 4
    // 1 
    // 2 2
    // 3 3 3
    // 4 4 4 4

    // floyd's triangle
    public static void floyds(int r , int c){
        int count = 1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i>=j){
                    System.out.print(count+ " ");
                    count++;
                }   
            }
           
            System.out.println();
        }
    }

    //butterfly pattern
    public static void butterfly( int n ){
        int totalLines=n;
        int stars =1;
        int spaces = 2*n-2;
        int curr_line= 1;
        while(curr_line<=totalLines){
            //print stars
            for(int i =1 ;i<=stars;i++){
                System.out.print("* ");
            }
            //print spaces
            for(int i =0;i<=spaces;i++){
                System.out.print(" ");
            }
            //print stars
            for(int i=1;i<=stars;i++){
                System.out.print("* ");
            }

            //make the cursor point at next line
            System.out.println();
            stars++;
            spaces = spaces-2;
            curr_line++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number of rows and columns");
        // int rows = sc.nextInt();
        // int columns = sc.nextInt();
        // sqaure(rows, columns);
        // bottomLeft(rows, columns);
        //topLeft(rows, columns);
        //topRight(rows, columns);
        // bottomRight(rows,columns);
        // bottomRightsecond(rows, columns);
        //X_pattern(rows, columns);
        //count(rows, columns);
        //countrows(rows, columns);
        //floyds(rows, columns);
        butterfly(4);
    }
}