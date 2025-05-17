 class mobile{
    static String name="ani";
    int price=10;

     static void hello(){
        System.out.println("vfjnrewnv");
        // static method can not access non static variables
        //System.out.println(price);
     }
 };
public class Demo {
    public static void main(String[] args) {
        String ans="Animesh";
        String a="Animesh";
        // System.out.println(ans.equals(a));
        // System.out.println(ans==a);
      
         mobile m1= new mobile();
         mobile m2= new mobile();
         //System.out.println(mobile.name);
         mobile.hello();

    }
}
