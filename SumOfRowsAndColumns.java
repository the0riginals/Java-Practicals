import java.util.Scanner;
//Program to find the sum of each row and each column of a matrix

class SumOfRowsAndColumns{
    public static void main(String args[]){
        int i,j,n,m,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter elements");
        for(i=0; i<m;i++){
            for(j=0;j<n;j++){
                a[i][j] = sc.nextInt();

            }
        }
        
        for(i=0;i<n;i++){
            sum = 0;
            for(j=0;j<m;j++){
                sum += a[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " is " + sum);
        }
        for(i=0;i<m;i++){
            sum = 0;
            for(j=0;j<n;j++){
                sum += a[j][i];
            }
            System.out.println("Sum of column " + (i+1) + " is " + sum);
        }
        
        sc.close();
    }
}