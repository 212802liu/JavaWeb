package work1;

import java.util.Scanner;

public class text5  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
      /*  String phoneNumber = input.nextLine().toUpperCase();
        for (int i =0; i < phoneNumber.length(); i++) {
            if (Character.isDigit(phoneNumber.charAt(i))) {
                System.out.print(phoneNumber.charAt(i));
            }
            else if (getNumber(phoneNumber.charAt(i)) == 1)
                System.out.print("-");
            else
                System.out.print(getNumber(phoneNumber.charAt(i)));
        }
        char a='a';
        System.out.println("\n"+getNumber(a));*/


        String s=input.nextLine();
        char [] a=s.toCharArray();
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]);
        System.out.println("");
        for (int i=0;i<a.length;i++){
            if (a[i]>='0'&&a[i]<='9')
                System.out.print(a[i]);
            else {
                if(getNumber(a[i])==1)
                    System.out.print("-");
                else System.out.print(getNumber(a[i]));
            }
        }
        System.out.println("\n"+getNumber('A'));
    }
    public static int getNumber(char uppercaseLetter) {
        int num = 100;
        switch (uppercaseLetter) {
            case '-':
                num = 1;
                break;
            case 'A':
                num = 2;
                break;
            case 'B':
                num = 2;
                break;
            case 'C':
                num = 2;
                break;
            case 'D':
                num = 3;
                break;
            case 'E':
                num = 3;
                break;
            case 'F':
                num = 3;
                break;
            case 'G':
                num = 4;
                break;
            case 'H':
                num = 4;
                break;
            case 'I':
                num = 4;
                break;
            case 'J':
                num = 5;
                break;
            case 'K':
                num = 5;
                break;
            case 'L':
                num = 5;
                break;
            case 'M':
                num = 6;
                break;
            case 'N':
                num = 6;
                break;
            case 'O':
                num = 6;
                break;
            case 'P':
                num = 7;
                break;
            case 'Q':
                num = 7;
                break;
            case 'R':
                num = 7;
                break;
            case 'S':
                num = 7;
                break;
            case 'T':
                num = 8;
                break;
            case 'U':
                num = 8;
                break;
            case 'V':
                num = 8;
                break;
            case 'W':
                num = 9;
                break;
            case 'X':
                num = 9;
                break;
            case 'Y':
                num = 9;
                break;
            case 'Z':
                num = 9;
        }
        return num;
    }
    /*public static int getNumber(char uppercaseLetter) {
        int num = 100;
        switch (uppercaseLetter+"") {
            case "-":
                num = 1;
                break;
            case "A":
                num = 2;
                break;
            case "B":
                num = 2;
                break;
            case "C":
                num = 2;
                break;
            case "D":
                num = 3;
                break;
            case "E":
                num = 3;
                break;
            case "F":
                num = 3;
                break;
            case "G":
                num = 4;
                break;
            case "H":
                num = 4;
                break;
            case "I":
                num = 4;
                break;
            case "J":
                num = 5;
                break;
            case "K":
                num = 5;
                break;
            case "L":
                num = 5;
                break;
            case "M":
                num = 6;
                break;
            case "N":
                num = 6;
                break;
            case "O":
                num = 6;
                break;
            case "P":
                num = 7;
                break;
            case "Q":
                num = 7;
                break;
            case "R":
                num = 7;
                break;
            case "S":
                num = 7;
                break;
            case "T":
                num = 8;
                break;
            case "U":
                num = 8;
                break;
            case "V":
                num = 8;
                break;
            case "W":
                num = 9;
                break;
            case "X":
                num = 9;
                break;
            case "Y":
                num = 9;
                break;
            case "Z":
                num = 9;
        }
        return num;
    }*/
}
