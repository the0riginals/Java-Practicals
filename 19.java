import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the order of the matrix : ");
        n = sc.nextInt();

        int mat[][] = new int[n][n];
        System.out.println("Enter the elements : ");

        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }

        Boolean flag = true;
        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i != j)
                    if(mat[i][j] != 0){
                        flag = false;
                        break;
                    }
                if(i==j)
                    if(mat[i][j] != 1){
                        flag = false;
                        break;
                    }
            }
        }
        if(flag)
            System.out.println("IdentityMatrix");
        else
            System.out.println("Not an IdentityMatrix");
    }
}