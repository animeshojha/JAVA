class ani{
    // public String toString() {
    //     return "I am a Animesh's object!";
    // }
};
class Outer {
    void show() {
        class Inner {
            void display() {
                System.out.println("Inside local inner class");
            }
        }
        Inner in = new Inner();
        in.display();
    }
}

public class Demo6 {
    public static void main(String[] args) {
        // ani a=new ani();
        // System.out.println(a);
        // System.out.println(a.hashCode());
        // String str="1";
        // int num=Integer.parseInt(str);
        // System.out.println(num);
        Outer obj=new Outer();
      
    }
}
