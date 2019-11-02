//Problem Statement: Write program to implement recursive functions for following tasks.
//To print n Fibonacci numbers

import java.util.Scanner;

class Fibonacci{
    static int fibo(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String args[]){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the sequence");
        n = sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print(fibo(i) + " ");
        }
        sc.close();
    }
}
