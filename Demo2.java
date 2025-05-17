class singers{
    private int age;
    private String name;

    singers(){
        System.out.println("this is an indian singer");
    }
    singers(String name){
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }
  
};
public class Demo2 {
    public static void main(String[] args) {
         singers s1=new singers();
         singers s2=new singers("Guru Randhawa");
         s2.display();
    }
}
