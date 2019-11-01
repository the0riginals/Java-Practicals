import java.util.Scanner;

class Main{

    static void leftR(int n, int arr[]){
        int temp = arr[0];
        for(int i = 0; i<n-1; i++)
            arr[i] = arr[i+1];
        arr[n-1] = temp;
    }

    public static void main(String args[]){
        int n, temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements in the array : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i =0; i<n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("How many times to left Rotate the array: ");
        temp = sc.nextInt();
        for(int i= 0; i < temp; i++)
            leftR(n , arr);
        
        System.out.println("After Rotations : ");
        for(int i= 0; i<n; i++)
            System.out.print(arr[i] + " ");
    } 
}