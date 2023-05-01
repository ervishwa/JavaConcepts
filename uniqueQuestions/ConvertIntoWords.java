package JavaConcepts.uniqueQuestions;
import java.sql.SQLOutput;
import java.util.*;

public class ConvertIntoWords {
    public static void printWords(int num){
        String ans = "";
        int n = num;
        while(n!=0){
            int currentnumber = n%10;
            switch(currentnumber){
                case 0 : ans = "zero " + ans;
                break;
                case 1 : ans = "one " + ans;
                break;
                case 2 : ans = "two " + ans;
                break;
                case 3 : ans = "three " + ans;
                break;
                case 4 : ans = "four " + ans;
                break;
                case 5 : ans = "five " + ans;
                break;
                case 6 : ans = "six " + ans;
                break;
                case 7 : ans = "seven " + ans;
                break;
                case 8 : ans = "eight " + ans;
                break;
                case 9 : ans = "nine " + ans;
                break;
                default :
                    System.out.println("invalid input");
                    break;
            }
            n = n/10;
        }
        System.out.print(ans);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printWords(n);
    }
}
