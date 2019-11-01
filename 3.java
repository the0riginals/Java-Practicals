import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int num1, num2, num3;
        System.out.println("Enter three numbers to find the largest : ");
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        num3 = Integer.parseInt(args[2]);

        if(num1>num2 && num1>num2)
            System.out.println("Largest : " + num1);
        else if(num2>num1 && num2>num3)
            System.out.println("Largest : " + num2);
        else
            System.out.println("Largest : " + num3);
    }
}