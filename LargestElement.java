//program to print largest element in an array
import java.util.Scanner;

class LargestElement{
    public static void main(String args[]){
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n= sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for(i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        int largest = a[0];
        for(i=0;i<n;i++){
            if(a[i] > largest){
                largest = a[i];
            }
        }
        System.out.println("Largest element in the array is " + largest);
    }
}