package JavaConcepts.uniqueQuestions;
import java.util.*;
import java.io.*;
public class Gcd {

    public static int getGcd(int A , int B){
        if(B==0) return A;
        return getGcd(B,A%B);
    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        //brutForce Approach TC(O(Math.min(M,N))).
//        int ans = 1;
//
//        int mini = Math.min(M,N);
//
//        for(int i = mini ; i >1 ; i--){
//            if(M%i==0 && N%i==0){
//                ans = i ;
//                break;
//            }
//        }

        //optimized version


       int ans = getGcd(M,N);
        System.out.print(ans);

    }
}
