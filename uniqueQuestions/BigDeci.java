package JavaConcepts.uniqueQuestions;
import java.lang.*;
import java.util.*;
import java.math.BigDecimal;
public class BigDeci {
    public static void swap(String arr[] , int i , int j ){
        String temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for(int i = 0 ; i < n - 1 ; i++){
            BigDecimal A = new BigDecimal(s[i]);
            for(int j = i+1 ; j < n ; j++){
                BigDecimal B = new BigDecimal(s[j]);

                if (A.equals(B)){
                    continue;
                }
                if(A.compareTo(B)<0){
                    swap(s,i,j);
                    A = B ;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}
