class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public void show(){
      System.out.println("this is inside calc class");
    }
};

class AdvanceCalc extends Calc {
    public int substract(int n1, int n2) {
        return n1 - n2;
    }
    public void show(){
        super.show();;
      System.out.println("this is inside Advance calc class");
    }

};

class A {
    void show() {
        System.out.println("this is the method of class A");
    }
}

class B  {
    void show() {
        System.out.println("this is the method of class A");
    }
};

public class Demo4 {
    public static void main(String[] args) {
        // AdvanceCalc c1=new AdvanceCalc();
        // int ans=c1.add(3,4);
        // System.out.println(ans);
        // int ans1=c1.substract(3,4);
        // System.out.println(ans1);
       AdvanceCalc c=new AdvanceCalc();
       c.show();
    }
}
