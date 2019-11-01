import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows to print : ");

        n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            int j = 1;
            for(j = 1; j<= i; j++){
                System.out.print(j + " ");
            }
            j -= 2;
            while(j > 0){
                System.out.print(j + " ");
                j -= 1;
            }
            System.out.println();
        }
    }
}