import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many numbers to add : ");
        n = sc.nextInt();

        System.out.println("Enter numbers : ");
        int sum = 0;
        for(int i =0; i<n; i++)
            sum += sc.nextInt();
        
        System.out.println("Sum : " + sum);
    }   
}