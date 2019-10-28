//program to print the elements of an array
//present in even position
import java.util.Scanner;

class EvenPosition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter number of elements");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for(i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Elements in the even positions");
        for(i=0; i<n; i++){
            if(i%2==0){
                System.out.print(a[i] + " ");
            }
        }
    }
}