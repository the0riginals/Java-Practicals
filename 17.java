import java.util.Scanner;

class Main{

    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("How many elements in the array : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i =0; i<n; i++)
            arr[i] = sc.nextInt();
        
        int largest = arr[0];
        for(int i = 1; i<n; i++)
            if(arr[i] > largest)
                largest = arr[i];
        
        System.out.println("Largest : " + largest);
    }   
}