//program to remove duplicate elements from 1D array

import java.util.*;

class DuplicateElement{
    static void removeDuplicateElements(int a[],int n){
        if(n==0 ){
            System.out.println("Array is empty");
        }
        else if(n==1){
            System.out.println("Array after removing duplicate elements: ");
            System.out.println(a[0]);
        }
        else{
            int i, j = 0;
            int temp[] = new int[n];
            for(i=0; i<n-1;i++){
                if(a[i]!=a[i+1]){
                    temp[j] = a[i];
                    j++;
                }
            }
            temp[j++] = a[n-1];
            a = temp;
            
            System.out.println("Array after removing duplicate elements: ");
            for(i=0; i<j; i++){
            System.out.println(a[i] + " ");
            }
        }
        
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter number of elements :");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for(i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        removeDuplicateElements(a,n);

    }
}