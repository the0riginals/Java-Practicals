import java.util.Scanner;
class pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        System.out.println("Enter length : ");
        n = sc.nextInt();
        sc.close();
        for(i=0; i<n; i++){
            
            for(j = i+1; j < n; j++ ){
                System.out.print("  ");
            }
            for(j=0; j<=i; j++){
                System.out.print((char)(65+j) + " ");
                
            }
            for(j = i-1; j >=0; j--){
                System.out.print((char)(65+j)+ " ");
            }
            System.out.println();

        }
    }
}
/*
OUTPUT:
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> javac pattern2.java
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java pattern2
Enter length :
4
      A
    A B A
  A B C B A
A B C D C B A
*/
