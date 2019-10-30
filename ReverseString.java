import java.util.Scanner;

class ReverseString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        sc.close();
        String reverse = "";
        for(int i = s.length()-1;i>=0;i--){
            reverse += s.charAt(i);
        }
        System.out.println("Reverse is " + reverse);
    }
}