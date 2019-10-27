//WAJP to accept n elements of an array and display 
//their sumof elements.
//Write userdefined exception to display proper message if 
//the number is negative
import java.util.*;

class NegativeNumber extends Exception{
    NegativeNumber(String s){
        super(s);
    }
}
class NegativeNumberException{
    public static void main(String args[]){
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter non negative numbers");
        for(i=0; i<n; i++){
            System.out.print("Enter element no. " + (i+1) + " :");
            a[i] = sc.nextInt();
            try{
                if(a[i] < 0){
                    throw new NegativeNumber("Only Non-negative numbers");
                }
                sum += a[i];
            }
            catch(NegativeNumber e){
                System.out.println("Exception: " + e);
                System.out.print("Enter element no. " + (i+1) + " :");
                a[i] = sc.nextInt();
                sum += a[i];

            }
            
        }
        sc.close();
        System.out.println("Sum = " + sum);


    }
}