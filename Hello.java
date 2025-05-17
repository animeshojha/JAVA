class Calculator{
   
    public int add(int num1,int num2){
        int r=num1+num2;
        
        return r;
    }
    public int add(int num1,int num2, int num3){
        int r=num1+num2+num3;
        
        return r;
    }
}
class Hello {

    public static void main(String args[]) {
        int num1=4;
        int num2=5;
        Calculator c1=new Calculator();
        int ans=c1.add(num1,num2);
        System.out.println(ans);
        System.out.println(c1);

        int arr[]={1,2,3,4};
        for(int a:arr){
          System.out.println(a);
        }
        
    }
}