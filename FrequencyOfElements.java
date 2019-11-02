import java.util.Scanner;

class FrequencyOfElements{
    public static void main(String args[]){
        int n, i, j, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = sc.nextInt();
        int a[] = new int[n] ;
        int frequency[] = new int[n] ;

        System.out.println("Enter elements");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            count = 1;
            for(j=i+1;j<n;j++){
                if(a[i] == a[j]){
                    count += 1;
                    frequency[j] = -1;
                }
                if(frequency[i]!=-1){
                    frequency[i] = count;
                }    
            } 
            
        }
        for(i=0;i<n;i++){
            if(frequency[i]!=-1){
                System.out.println("Frequency of " + a[i] + " is " + frequency[i]);
            }
        }
            
    }
}