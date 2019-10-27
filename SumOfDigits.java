import java.util.*;
class SumOfDigits{
    static int Summation(int n){
        int temp = n;
        int sum = 0;
        int rem;
        for(;temp!=0;){
            rem = temp%10;
            sum += rem;
            temp = temp/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits :" + Summation(n));
        sc.close();
    }
}