package JavaConcepts.oops;

class Person {
    String name ;
    int age ;
  private  String password;
  //getter function
   public String getpass(){
        return password;
    }
  //setter function
    public void setpass(String num){
       this.password = num;
    }
}
public class encapsulation {
    public static void main(String[]args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "vishnu";
        p1.setpass("12344");
        System.out.println(p1.getpass());
        System.out.println(p2.getpass());

    }

}
