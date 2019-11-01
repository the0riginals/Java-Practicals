import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its square :");
        num = sc.nextInt();
        System.out.println("Square : " + num*num);
    }
}
