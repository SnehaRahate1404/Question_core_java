// public class start_pattern{
//     public static void main(String args[]){
//         for(int i = 0; i<=4 ;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// } 

// invertd star pattern

/* public class start_pattern{
    public static void main(String args[]){
        for(int i = 1; i<=4 ;i++){
            for(int j=1;j<=(4-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

// half pyramod pattern
/* public class start_pattern{
    public static void main(String args[]){
        for(int i = 1; i<=4 ;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
} */

//character pattern
// public class start_pattern{
//     public static void main(String args[]){
//         char ch ='A';
//         for(int i = 1; i<=4 ;i++){
//             while (i == 1 || i==4){
                
//             }
//             System.out.println();
//         }
//     }
// }

 
public class start_pattern{
    //hollow rectangle pattern
    public static void hollow_rectangle(int rows , int columns){
        for(int i = 1 ;i <= rows ;i++){
            for(int j=1 ;j <= columns ;j++){
                if(i ==1 || i == rows || j==1 || j == columns ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    // inverted and rotated half-pyramid
    public static void half_inverted_pyramid(int rows , int columns){
        for(int i = 1 ; i<= rows ;i ++){
           for(int j = columns ; j>=1 ; j--){
              
           }
           System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(4, 4);
    }
}
