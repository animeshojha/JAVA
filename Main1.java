class Student {
    private int age;
    private String name;


    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {

            age = newAge;
        }
        else{
            System.err.println("age can not be less than 0");
        }
    }
};

public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student();
         s1.setAge(21);
         s1.setName("Animesh");
         System.out.println(s1.getName());
    }
}
