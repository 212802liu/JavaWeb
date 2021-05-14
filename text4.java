package work1;

import java.util.*;
import java.math.*;
//import java.text.DecimalFormat;  //两位小数
public class text4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numerator:");

        int x=sc.nextInt();
        System.out.println("Enter a denominator:");
        int y=sc.nextInt();
        if(x<y)
            System.out.println(x+"/"+y+" is a proper fraction ");
        else if(x%y!=0)
            System.out.println(x+"/"+y+" is an improper fraction and its mixed fraction is "+x/y+'+'+x%y+"/"+y);
        else
            System.out.println(x+"/"+y+" is an improper fraction and it can be reduced to "+x/y);

    }
}
