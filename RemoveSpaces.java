import java.util.Scanner;

class RemoveSpaces{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0,i;
        System.out.println("Enter string");
        String string = sc.nextLine();
        char ch[] = string.toCharArray();
        String newstring = "";
        for(i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                newstring += ch[i];
            }
        }
        System.out.println("After removing spaces : " + newstring);
        sc.close();
    }
}