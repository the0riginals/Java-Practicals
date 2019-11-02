//Problem Statement: Write program to implement recursive functions for following tasks.
//To find X^Y

import java.util.Scanner;

class PowerUsingRecursion{
    static int power(int x,int y){
        if(y==0){
            return 1;
        }
        else{
            return x*power(x, y-1);
        }
    }
    public static void main(String args[]){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        x = sc.nextInt();
        System.out.println("Enter power: ");
        y = sc.nextInt();

        System.out.println("Power is " + power(x, y));
        sc.close();


    }
}