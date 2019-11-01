import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int n ;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows to print: ");
        n = sc.nextInt();
        char temp;
        for(int i =0; i<n; i++){
            temp = 'A';
            for(int j = 0; j<n-i; j++)
                System.out.print(" \t");
            
            int j;
            for(j = 0; j <= i; j++)
                System.out.print(temp++ + "\t");
            
            j -= 2;
            temp -= 2;
            while(j > -1){
                System.out.print(temp-- + "\t");
                j -= 1; 
            }
            System.out.println();
        }
    }
}