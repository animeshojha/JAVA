class A{
    public void show(){
        System.out.println("In a show");
    }
}
class B extends A {
    
   public void show(){
        System.out.println("In B show");
    }
    
};
public class Demo5 {
    public static void main(String[] args) {
        B a=new B();
        a.show();
    }
}
