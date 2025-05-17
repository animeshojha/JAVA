 class student {
     int age;
     String name;
     int marks;
    
}
public class Array {
    public static void main(String[] args) {

        int[] arr;
        arr = new int[8];
        // for(int a:arr){
        // System.out.println(a);
        // }

        int[][] arr2;
        arr2 = new int[2][3];
        arr2[0][1] = 1;
        // for(int a[]:arr2){
        // for(int b:a){
        // System.out.print(b+ " ");
        // }
        // System.out.println();
        // }

        int[][][] arr3;
        arr3 = new int[3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr3[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        // for (int a[][] : arr3) {
        //     for (int b[] : a) {
        //         for (int c : b) {
        //             System.out.print(c+ " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();

        // }

        // jagged array 

        int [][] arr4;
        arr4=new int[3][];

        arr4[0]=new int[3];
        arr4[1]=new int[2];
        arr4[2]=new int[4];

        // for(int i=0;i<arr4.length;i++){
        //     for(int j=0;j<arr4[i].length;j++){
        //         arr4[i][j]=(int)(Math.random()*10);
        //     }
        // }
        // for(int a[]:arr4){
        //     for(int b:a){
        //         System.out.print(b+ " ");
        //     }
        //     System.out.println();
        // }


        student s1=new student();
        s1.age=12;
        s1.name="Animesh";
        s1.marks=98;

        student s2=new student();
        s2.age=13;
        s2.name="Animesh ojha ";
        s2.marks=99;
        student[] students=new student[2];
        students[0]=s1;
        students[1]=s2;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].age+ " " +students[i].marks + " "+students[i].name);
        }
       
    }
}
