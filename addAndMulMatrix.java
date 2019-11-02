//Problem Statement:
//Write the Menu driven program to perform
//a) Addition of two matrices of order m*n and p*q
//b) Multiplication of two matrices of order m*n and p*q
import java.util.Scanner;

class addAndMulMatrix{
    static void add(int m, int n,int a[][], int p, int q,int b[][]){
        if(m!=n || p!=q){
            System.out.println("The Given matrices cannot be added");
            return;
        }
        int c[][] = new int[m][n];
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                c[i][j] = a[i][j] + b[i][j] ;
            }
        }
        System.out.println("Addition is ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void mulitply(int m, int n, int a[][], int p, int q, int b[][]){
        int i,j,k,mul;
        if(n!=p){
            System.out.println("The given matrices cannot be multiplied");
            return;
        }
        int c[][] = new int[m][q];
        for(i=0;i<m;i++){
            for(j=0;j<q;j++){
                mul = 0;
                for(k=0;k<n;k++){
                    mul += a[i][k]*b[k][j];
                }
                c[i][j] = mul;
            }
        }
        System.out.println("Multiplication is ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int m , n , p, q, i, j,ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of 1st matrix");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter elements");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number of rows and columns of 2nd matrix");
        p = sc.nextInt();
        q = sc.nextInt();
        int b[][] = new int[p][q];
        System.out.println("Enter elements");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j] = sc.nextInt();
            }
        }
        do{
            System.out.println("***MENU***");
            System.out.println("1. Add ");
            System.out.println("2. Multiply");
            System.out.println("3. Exit");
            System.out.println("Enter choice");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    add(m, n, a, p, q, b);
                    break;
                case 2:
                    mulitply(m, n, a,p,q,b);
                    break;
                case 3:
                    System.out.println("Bye");
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=3);
        sc.close();

    }
}