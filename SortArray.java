import java.util.Scanner;

//program to sort the elements of an array
//in ascending order

class SortArray{

    static void selectionSort(int a[], int n){
        int min,i,j,swap;
        for(i=0;i<n-1;i++){
            min = i;
            for(j=i;j<n;j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            if(min!=i){
                swap = a[i];
                a[i] = a[min];
                a[min] = swap;
            }

        }
    }
    public static void main(String args[]){
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter elements");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        selectionSort(a, n);

        System.out.println("After sorting");
        for(i=0;i<n;i++){
            System.out.println(a[i] + " ");
        }
        sc.close();
    }
}
