//program to left rotate the elements of an array
import java.util.*;

class LeftRotate{

    static void rotate(int a[],int n){
        int temp = a[0];
        int i;
        for(i=0; i<n-1; i++){
            a[i] = a[i+1];
        }
        a[n-1] = temp;
    }
    public static void main(String args[]){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for(i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        rotate(a,n);

        System.out.println("After left rotation");
        for(i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}