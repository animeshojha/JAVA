class bike{
    String brand;
    int price;
    static String name;

    static{
        name="guru";
        System.out.println("In static block");
    }
    public bike(){
        brand="cw";
        System.out.println("In constructor");
    }
     void display(){
        System.out.println(price+ " "+brand);
    }
};
public class Demo1 {

    public static void main(String[] args) throws ClassNotFoundException {
       Class.forName("bike");
    }
}