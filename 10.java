import java.util.Scanner;


class Main{

    static int ndigs(int num){
        int n = 0;
        while(num > 0){
            n += 1;
            num /= 10;
        }
        return n;
    }

    public static void main(String args[]){
        int num, digs, dig;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if its Armstrong :");
        num = sc.nextInt();
        digs = ndigs(num);
        int num_save = num;
        int ans = 0;

        while(num > 0){
            dig = num%10;
            ans += (int)Math.pow(dig, digs);
            num /= 10;
        }

        if(ans == num_save)
            System.out.println("Armstrong Number");
        else
            System.out.println("NOT an Armstrong Number");
    }
}