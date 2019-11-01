import java.util.Scanner;

class NegativeNumber extends Exception{
    public NegativeNumber(String s){
        super(s);
    }
}


class Main{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers to add : ");
        n = sc.nextInt();

        int num[] = new int[n];
        int temp, sum = 0;
        System.out.println("Enter numbers : ");
        try{
            for(int i =0; i<n; i++){
                temp = sc.nextInt();
                if(temp < 0)
                    throw new NegativeNumber("!! No Negatives Allowed !!");
                num[i] = temp;
                sum += temp;
            }
        }catch(Exception x){
            System.out.println("Exception Occured : " + x);
        }
        System.out.println("Sum : " + sum);
    }
}