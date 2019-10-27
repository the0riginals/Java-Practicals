//Write a java program to calculate area of circle,rectangle,triangle
//using the concept of method overloading

import java.util.*;

class figure{
    public static double findArea(float r){
        return (3.14*r*r);
    }
    public static float findArea(float l, float b){
        return l*b;
    }
    public static float findArea(float l, float b, float h){
        return (b*h)/2;
    }
}

public class Area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        figure f = new figure();
        float  l, b, h, r;
        int ch;
        do{
            System.out.println("1. Area of circle");
            System.out.println("2. Area of rectange");
            System.out.println("3. Area of triangle");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter radius: ");
                    r = sc.nextFloat();
                    System.out.println("Area of circle: " + f.findArea(r));
                    break;
                case 2:
                    System.out.println("Enter length ");
                    l = sc.nextFloat();
                    System.out.println("Enter width ");
                    b = sc.nextFloat();
                    System.out.println("Area of rectangle: " + f.findArea(l,b));
                    break;
                case 3:
                    System.out.println("Enter base");
                    b = sc.nextFloat();
                    System.out.println("Enter height");
                    h = sc.nextFloat();
                    System.out.println("Area of triangle : " + f.findArea(0,b,h));
                case 4:
                    System.out.println("Bye");

            }
        }while(ch!=4);

        
    }
}
/*
OUTPUT:
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> javac Area.java
PS E:\Keshav\JAVA-Folders\Java-Practical-exam> java Area
1. Area of circle
2. Area of rectange
3. Area of triangle
4. Exit
Enter choice: 1
Enter radius:
10
Area of circle: 314.0
1. Area of circle
2. Area of rectange
3. Area of triangle
4. Exit
Enter choice: 2
Enter length
10
Enter width
10
Area of rectangle: 100.0
1. Area of circle
2. Area of rectange
3. Area of triangle
4. Exit
Enter choice: 3
Enter base
10
Enter height
10
Area of triangle : 50.0
Bye
1. Area of circle
2. Area of rectange
3. Area of triangle
4. Exit
Enter choice: 4
Bye
*/