package JavaConcepts.uniqueQuestions;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class BigInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        BigInteger c = A.add(B);

        System.out.print(c);

    }
}


//theory about BigInteger
//1) Declaration:
//
//        int a, b;
//        BigInteger A, B;
//        2) Initialization:
//
//        a = 54;
//        b = 23;
//        A = BigInteger.valueOf(54);
//        B = BigInteger.valueOf(37);
//        And for Integers available as string you can initialize them as:
//
//        A = new BigInteger(“54”);
//        B = new BigInteger(“123456789123456789”);
//        3) Mathematical operations:
//
//        BigInteger C = A.add(B);
//        Other similar function are subtract() , multiply(), divide(), remainder()
//
//        Extraction of value from BigInteger:
//
//        int x = A.intValue(); // value should be in limit of int x
//        long y = A.longValue(); // value should be in limit of long y
//        String z = A.toString();
