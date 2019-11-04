import java.util.Scanner;

class Name{
    int rollNo;
    Scanner sc = new Scanner(System.in);

    public void getRollNo(){
        System.out.println("Enter the roll No : ");
        this.rollNo = sc.nextInt();
    }

    public void putRollNo(){
        System.out.println("Roll No. : " + this.rollNo);
    }
}

class Test extends Name{
    int sub1, sub2, sub3;
    Scanner sc = new Scanner(System.in);
    public void getMarks(){
        System.out.println("Enter the marks in three subjects");
        this.sub1 = sc.nextInt();
        this.sub2 = sc.nextInt();
        this.sub3 = sc.nextInt();
    }

    public void putMarks(){
        System.out.println("Sub1 : " + this.sub1);
        System.out.println("Sub2 : " + this.sub2);
        System.out.println("Sub3 : " + this.sub3);
    }
}


interface Sports{
    public void getSportCr();
    public void putSportCr();
}

class Result extends Test implements Sports{
    int sportsCr;
    Scanner sc = new Scanner(System.in);
    
    public void getSportCr(){
        System.out.println("Enter Sports Credits : ");
        sportsCr = sc.nextInt();
    }

    public void putSportCr(){
        System.out.println("Sports Credits : " + sportsCr);
    }

    public void getResult(){
        getRollNo();
        getMarks();
        getSportCr();
    }

    public void putResult(){
        System.out.println("---RESULT---");
        putRollNo();
        putMarks();
        putSportCr();
    }
}

class Main{

    public static void main(String[] args) {
        Result r1 = new Result();
        r1.getResult();
        r1.putResult();
    } 
}
