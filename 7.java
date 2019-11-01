import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        String ans = "";
        int dig ;
        while(num > 0){
            dig = num % 10;
            switch(dig){
                case 0:
                    ans = "Zero ".concat(ans);
                    break;
                case 1:
                    ans = "One ".concat(ans);
                    break;
                case 2:
                    ans = "Two ".concat(ans);
                    break;
                case 3:
                    ans = "Three ".concat(ans);
                    break;
                case 4:
                    ans = "Four ".concat(ans);
                    break;
                case 5:
                    ans = "Five ".concat(ans);
                    break;
                case 6:
                    ans = "Six ".concat(ans);
                    break;
                case 7:
                    ans = "Seven ".concat(ans);
                    break;
                case 8:
                    ans = "Eight ".concat(ans);
                    break;
                case 9:
                    ans = "Nine ".concat(ans);
                    break;
                }
            num /= 10;
        }
        System.out.println("INwords : " + ans);
    }
}