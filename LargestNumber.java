import java.util.*;
import java.lang.*;
class LargestNumber{
    public static void main(String args[]){
        int n1, n2, n3;
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        n3 = Integer.parseInt(args[2]);
        int largest;
        if(n1>n2){
            if(n1>n3){
                largest = n1;
            }
            else{
                largest = n3;
            }
        }
        else{
            if(n2>n3){
                largest = n2;
            }
            else{
                largest = n3;
            }
        }
        System.out.println("Largest number is  " + largest);

    }
}

/*
OUTPUT:
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> javac LargestNumber.java
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java LargestNumber 1 2 3
Largest number is  3
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java LargestNumber 78 27 18
Largest number is  78
*/