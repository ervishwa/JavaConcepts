package JavaConcepts.oops.ClassesAndObjects;

public class Second {
    static void mysecondmethod(){
        System.out.println("calling my mysecodnmethod");
    }
    public static void main(String[]args){
        Main n1 = new Main();
        System.out.println(n1.num);
        System.out.println(n1.num2);
        //we can also override the properties of a class.
        //like
        n1.num = 50;
        System.out.println(n1.num);  //previously it was 5 and now it is 50.
        //if you want that nobody can override the attributes of class go and declare the attribute as final.
        //The final keyword is called a "modifier".
        n1.myMethod(); //here ,myMethod in different class that's why it is working fine.if use in the same class we
                       //have to write static keyword.

        mysecondmethod();
    }
}
