import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements in the araay : ");
        n = sc.nextInt();

        int arr[] = new int [n];
        System.out.println("Enter the elements : ");
        for(int i =0; i<n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("Evenly positioned elements are : ");
        int i =0;
        while(i < n){
            System.out.print(" " + arr[i]);
            i += 2;
        }
    }
}
