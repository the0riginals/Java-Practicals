import java.util.*;


class Armstrong{
    boolean isArmstrong(int n){
        int temp, rem, sum = 0;
        temp = n;
        while(temp!=0){
            rem = temp%10;
            sum += rem*rem*rem;
            temp = temp/10;
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        Armstrong a = new Armstrong();
        if(a.isArmstrong(n)){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
        
    }
}
/*
OUTPUT:
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java Armstrong
Enter number:
153
Number is Armstrong

*/