package JavaConcepts.oops;
class Outer {
    int x = 10;
    class Inner {
        int y = 20;

       public int printx(){
            return x;
        }
    }
    static class Inner2 {
        int z = 30;
    }

}
public class javaInnerClasses {

  public static void main(String[]args){
      Outer outer = new Outer();
      Outer.Inner inner = outer.new Inner(); //creating Inner class.
      //System.out.println(inner.y);
      Outer.Inner2 inner2 = new Outer.Inner2();

      System.out.println(inner2.z);

      System.out.println(inner.printx());

  }
}
