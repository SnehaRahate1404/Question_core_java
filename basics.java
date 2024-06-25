import java.util.*;
public class basics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number whose average you want to calculate");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        assignment_questions ans = new assignment_questions();
        // System.out.print("average of numbers is ");
        // System.out.println(ans.avg(num1, num2, num3));
        // System.out.println("Enter the side of square");
        // int side = sc.nextInt();
        // System.out.print("Area of sqaure is ");
        // System.out.println(ans.area_square(side));
        // System.out.println("enter the amont of the items");
        // float pencil = sc.nextInt();
        // float eraser = sc.nextInt();
        // float pen = sc.nextInt();
        // System.out.print("total bill is ");
        // System.out.println(ans.bill(pencil, eraser, pen));
        ans.positive_negative(num3);
    }
}
class assignment_questions{
        
    public int avg(int num1,int num2,int num3){
            int avg = (int)(num1+num2+num3)/3;
            return avg;
    }

    public int area_square(int side){
        int area = side*side;
        return area;
    }

    public float bill(float item1 , float item2 ,  float item3){
        float bill = item1 + item2+item3;
        return bill;
    }

    public void positive_negative(int num){
        if(num>=0){
            System.out.println("positive number");
        }else{
            System.out.println("negative number");
        }
    }
}
