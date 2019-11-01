import java.util.Scanner;

//For a year to be a leap year
// it must be divisible by 4
// if it is also divisible by 100
// then it should also be divisible by 400

class Main{
    public static void main(String args[]){
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year to check is its a leap year : ");
        year = sc.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0 && year%100==0))
            System.out.println("Leap Year");
        else 
            System.out.println("Not a Leap Year");
    }
}
