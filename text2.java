package homework.work1;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;  //两位小数
public class text2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filing status:");
       int a = sc.nextInt();
        System.out.println("Enter the taxable income:");
        double money = sc.nextDouble();
        double tax=0;
        switch (a) {
            case 0:
                tax = deal(money, 8350, 33950, 82250, 171550, 372950);
                break;
            case 1:
                tax = deal(money, 16700, 67900, 137050, 208850, 372950);
                break;
            case 2:
                tax = deal(money, 8350, 33950, 68525, 104425, 186475);
                break;
            case 3:
                tax = deal(money, 11950, 45500, 117450, 190200, 372950);
                break;
            default:
                break;
        }
        System.out.println("Enter the taxable income:"+tax);

    }

 public  static int sum(int a,int b){
    return a+b;
}

 public static double deal(double money,double a,double b,double c,double d,double e){
    double sum;
    if(money<=a)
        sum =money*0.1;
    else if(money<=b)
        sum=a*0.1+(money-a)*0.15;
    else if(money<=c)
        sum=a*0.1+(b-a)*0.15+(money-b)*0.25;
    else if(money<=d)
        sum=a*0.1+(b-a)*0.15+(c-b)*0.25+(money-c)*0.28;
    else if(money<=e)
        sum=a*0.1+(b-a)*0.15+(c-b)*0.25+(d-c)*0.28+(money-d)*0.33;
    else
        sum=a*0.1+(b-a)*0.15+(c-b)*0.25+(d-c)*0.28+(e-d)*0.33+(money-e)*0.35;

return sum;
}
}

