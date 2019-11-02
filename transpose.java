//Problem Statement:
//Write the Menu driven program to perform
//a) Addition of two matrices of order m*n and p*q
//b) Transpose of matrix of order m*n
import java.util.Scanner;

class transpose{
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
    static void findTranspose(int m, int n, int a[][], int p, int q, int b[][]){
        int i, j;
        System.out.println("Transpose of 1st matrix");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of 2nd matrix");
        for(i=0;i<q;i++){
            for(j=0;j<p;j++){
                System.out.print(b[j][i] + " ");
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
        for(i=0;i<p;i++){
            for(j=0;j<q;j++){
                b[i][j] = sc.nextInt();
            }
        }
        do{
            System.out.println("***MENU***");
            System.out.println("1. Add ");
            System.out.println("2. Transpose");
            System.out.println("3. Exit");
            System.out.println("Enter choice");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    add(m, n, a, p, q, b);
                    break;
                case 2:
                    findTranspose(m, n, a,p,q,b);
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