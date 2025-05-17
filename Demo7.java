@FunctionalInterface
interface A {
    int add(int a, int b);

    default void doSomething() {
        System.out.println("doing");
        System.out.println("doing");
    }
}

public class Demo7 {
    public static void main(String[] args) {
      A a=(x,y)->x+y;
      int ans=a.add(4, 5);
      System.out.println(ans);
      a.doSomething();
    }
}
