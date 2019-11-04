import java.util.Scanner;
//Program to determine whether a given matrix is an identity matrix

class CheckIdentityMatrix{
    public static void main(String args[]){
        int i,j,m,n,flag = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter elements");
        for(i=0; i<m;i++){
            for(j=0;j<n;j++){
                a[i][j] = sc.nextInt();
                if(i==j && a[i][j] !=1){
                    flag = -1;
                }
                else if(i!=j && a[i][j]!=0){
                    flag = -1;
                }
            }
        }
        if(flag==-1)
        {
            System.out.println("Given matrix is not identity");
        }
        else{
            System.out.println("Given matrix is identity");
        }
    }
}