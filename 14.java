import java.util.*;

class Main{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How many elements in the array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }


        System.out.println("Before removing duplicates : \n");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + "\t");
        }


        for(int i = 0; i<n-1; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(arr[i] == arr[j])
                {
                    for(int k = j; k < n-1; k++)
                    {
                     arr[k] = arr[k+1];
                    }
                    n -= 1;
                }
            }
        }

        
        System.out.println("\nAfter removing all duplicates : \n");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + "\t");
        }
    }   
}