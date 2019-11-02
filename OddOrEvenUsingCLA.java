//Problem Statement: Write a program to demonstrate the use of command line argument for
//check whether number is even or odd.

class OddOrEvenUsingCLA{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        if(n%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}

