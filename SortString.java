import java.util.*;

class SortMyStr{
    String input;
    SortMyStr(String input){
        this.input = input;
    }
    public String sortStr(){
        char temp[] = this.input.toCharArray();
        Arrays.sort(temp);
        return String(temp);
    }
}
class SortString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Enter string: ");
        input = sc.nextLine();
        sc.close();
        SortMyStr s = new SortMyStr(input);
        s.sortStr();
        System.out.println("Sorted string: " + s.sortStr());
    }
}
/*
OUTPUT:
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> javac SortString.java
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java SortString
Enter string:
keshav
Sorted string: aehksv
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> javac SortString.java
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java SortString
Enter string:
edcba
Sorted string: abcde
*/