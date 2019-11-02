import java.util.Scanner;

class GcdAndLcm{

    static int gcd(int a,int b){
        if(b>a){
            int c= a;
            a = b;
            b = a;
        }
        if(a%b==0){
            return b;
        }
        else{
            return gcd(b,a%b);  
        }
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Lcm = " + lcm(a,b));
        System.out.println("Gcd = " +  gcd(a,b));
        sc.close();

    }
}