import java.io.*;
import java.util.*;

//Program to print nPr of the given numbers

class nPr{
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);

        }
    }
    static int cal(int n,int r){
        return fact(n) / fact(n-r);
    }
    
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter value of n: ");
        int n = sc.nextInt();
        System.out.println("\nEnter the value of r: ");
        int R = sc.nextInt();
        sc.close();  
        System.out.println(n + "P" + R + " = " + cal(n,R));
    }
}
/*
OUTPUT:
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> javac nPr.java
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java nPr

Enter value of n:
5

Enter the value of r:
2
5P2 = 20
*/