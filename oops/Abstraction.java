package JavaConcepts.oops;

abstract class Animal {   //you can't make object of it directly.
   final int NoOfLegs = 4;

    public abstract void AnimalSound();
}
 class Dog extends Animal{
   public void AnimalSound(){
        System.out.println("bhaw bhaw");
    }
 }


public class Abstraction {
    public static void main(String[]args){

        Dog mydog = new Dog();

        mydog.AnimalSound();
        //mydog.NoOfLegs = 6;
        System.out.println(mydog.NoOfLegs);
    }
}
