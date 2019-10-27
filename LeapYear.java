import java.util.*;

class LeapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        //A leap year is every 4 years, but not every 100 years, 
        //then again every 400 years.
        if((year%4==0 && year%100!=0) || (year%400==0 && year%100 ==0)){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }

}    
/*
OUPUT:
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> javac LeapYear.java
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java LeapYear
Enter year:
2000
2000 is a leap year
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java LeapYear
Enter year:
1600
1600 is a leap year
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java LeapYear
Enter year:
1904
1904 is a leap year
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java LeapYear
Enter year:
2019
2019 is not a leap year
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java LeapYear
Enter year:
2232
2232 is a leap year

*/