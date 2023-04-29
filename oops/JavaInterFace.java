package JavaConcepts.oops;
//another way to achieve abstraction in java is with interfaces.

//interface  Human {
//    public void canwalk();
//    public void cantalk();
//
//    int n = 10;
//}
//class Person1 implements Human{
//    public void canwalk(){
//        System.out.println("person can walk");
//    }
//    public void cantalk(){
//        System.out.println("person can talk");
//    }
//}


//with the help of interface we can do multiple inheritance in java lets see an example...

interface Human {
    int NoOFLegs= 2 ;
    public void cantalk();
}
interface Alien {
    int NoOFHands = 5;

    public void canfly();
}

class SuperHero implements Human,Alien{
    public void cantalk(){
        System.out.println("superhero can talk");
    }
    public void canfly(){
        System.out.println("superherpo can fly");
    }
}
class Supergirl implements Human,Alien{
    public void cantalk(){
        System.out.println("supergirl can talk");
    }
    public void canfly(){
        System.out.println("supergirl can fly");
    }
}


public class JavaInterFace {
    public static void main(String[]args){


//        Person1 p1 = new Person1();
//
//        p1.cantalk();
//        System.out.println(p1.n);


        //creating the instance of vishnu

        SuperHero vishnu = new SuperHero();
        Supergirl priya = new Supergirl();

        priya.canfly();
        vishnu.canfly();
        System.out.println(vishnu.NoOFLegs);
    }
}
