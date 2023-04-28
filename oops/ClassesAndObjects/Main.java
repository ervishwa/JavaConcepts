package JavaConcepts.oops.ClassesAndObjects;

public class Main {
    int num = 5; //class attributes or class variable.(another term of class attributes is fields).
   private int num2 = 10;

    //methods

   private void myMethod(){
        System.out.println("Hello World !");
    }

    public static void main(String[]args){
       Main n1 = new Main();
       n1.myMethod();
       System.out.println(n1.num2);
    }
}
