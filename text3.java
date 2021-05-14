package work1;

import java.util.*;
import java.math.*;
import java.text.DecimalFormat;  //两位小数
public class text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates:");
        float x=sc.nextInt();
        float y=sc.nextInt();
        if(Math.abs(x)<=5||Math.abs(y)<=2.5)
        System.out.println("Point ("+x+','+y+") is in the rectangle");
        else
        System.out.println("Point ("+x+','+y+") is not in the rectangle");


    }
}
