import java.util.Scanner;

class TotalCharacters{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0,i;
        System.out.println("Enter string");
        String string = sc.nextLine();
        char ch[] = string.toCharArray();

        for(i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                count++;
            }
        }
        System.out.println("Number of characters = " + count);
        sc.close();
    }
}