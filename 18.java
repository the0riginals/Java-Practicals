import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int n;
        int ud = 0, ld = 0, d = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of the matrix : ");
        n = sc.nextInt();

        int mat[][] = new int [n][n];
        System.out.println("Enter the elements of the matrix : ");
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                mat[i][j] = sc.nextInt();
                if(i < j)
                    ud += mat[i][j];
                else if(i > j)
                    ld += mat[i][j];
                else
                    d += mat[i][j];
            }
        }
        System.out.println("Upper Diagonal Sum: " + ud);
        System.out.println("Lower Diagonal Sum: " + ld);
        System.out.println("Diagonal Sum: " + d);
    }
}