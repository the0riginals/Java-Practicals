public class Threads{
    public static void main(String args[]){
        FirstThread f = new FirstThread();
        SecondThread s = new SecondThread();
        ThirdThread t = new ThirdThread();
        f.start();
        s.start();
        t.start();
    }
}
class FirstThread extends Thread{
    public void run(){
        int i;
        for(i=0; i<=10;i++){
            System.out.println("5 X " + i  + " = " + i*5);
        }
        System.out.println("First thread finished");
    }
}
class SecondThread extends Thread{
    public void run(){
        int i;
        for(i=0; i<=10;i++){
            System.out.println("7 X " + i  + " = " + i*7);
        }
        System.out.println("Second thread finished");
    }
}

class ThirdThread extends Thread{
    public void run(){
        int i;
        for(i=0; i<=10;i++){
            System.out.println("13 X " + i  + " = " + i*13);
        }
        System.out.println("Third thread finished");
    }
}

