//Program to count the total number of vowels and consonants in a string
import java.util.Scanner;

class CountVowelsConsonants{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String string = sc.nextLine();
        string = string.toLowerCase();
        char ch[] = string.toCharArray();
        int i,vowels = 0,consonants = 0;
        for(i=0; i<ch.length;i++){
            if(ch[i]=='a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'u'|| ch[i] == 'o'){
                vowels++;
            }
            else if(ch[i] >= 'a' && ch[i] <='z')
            {
                consonants++;
            }
        }
        System.out.println("Number of vowels = " + vowels);
        System.out.println("Number of consonants = " + consonants);
        sc.close();
    }
}