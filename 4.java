import java.util.Scanner;

class Main{

    static int fact(int num){
        if(num == 0)
            return 1;
        else
            return num * fact(num-1);
    }

    static int nPr(int n, int r){
        return fact(n)/fact(n-r);
    }

    public static void main(String args[]){
        int n, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r for nPr : ");
        n = sc.nextInt();
        r = sc.nextInt();

        System.out.println("nPr : " + nPr(n, r));
    }
}