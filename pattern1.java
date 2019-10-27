import java.util.Scanner;
class pattern1{
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
                System.out.print(j+1 + " ");
                
            }
            for(j = i-1; j >=0; j--){
                System.out.print(j+1+ " ");
            }
            System.out.println();

        }
    }
}
/*OUTPUT:
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> javac pattern1.java
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java pattern1
Enter length :
5
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/