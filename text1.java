package work1;

import java.math.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;  //两位小数
import java.util.Formatter;
import java.util.Scanner;

public class text1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入投资金额:");


        double money=sc.nextDouble();
        System.out.println("输入年利率：");

        double r=sc.nextDouble();
        System.out.println("输入年数：");
        double year=sc.nextDouble();

        double x=Math.pow((1+r*0.01/12),year*12)*money;


        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(x));
    }
}






