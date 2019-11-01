import java.util.Scanner;

class Circle{ 
    int radius;

    public Circle(int r){
        this.radius = r;
    }

    public double area(){
        return 3.14 * this.radius * this.radius;
    }
}


class Rectangle{
    int length, breadth;
    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public double area(){
        return this.length * this.breadth;
    }
}


class Triangle{
    int base, height;

    public Triangle(int b, int h){
        this.base = b;
        this.height = h;
    }

    public double area(){
        return 0.5 * this.base * this.height;
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(choice != 4){
            System.out.println("---- MENU ----");
            System.out.println("1.  Circle");
            System.out.println("2.  Rectangle");
            System.out.println("3.  Triangle");
            System.out.println("4.  EXIT");

            System.out.println("Enter choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the radius of the circle : ");
                    Circle c1 = new Circle(sc.nextInt());
                    System.out.println("Area : " + c1.area());
                break;

                case 2:
                    System.out.println("Enter the length and breadth : ");
                    Rectangle r1 = new Rectangle(sc.nextInt(), sc.nextInt());
                    System.out.println("Area : " + r1.area());
                break;

                case 3:
                    System.out.println("Enter the base and height : ");
                    Triangle t1 = new Triangle(sc.nextInt(), sc.nextInt());
                    System.out.println("Area : " + t1.area());
                break;

                case 4:
                break;

                default:
                    System.out.println("!! Invalid  Choice !!");

            }
        }
    }
}