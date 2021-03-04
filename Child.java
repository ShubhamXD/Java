class Child extends Parent{
    void f3(){
        System.out.print("This is f3");
    }
    public static void main(String[] args) {
        Child c=new Child();
        c.f1();
        c.f2();
        c.f3();
    }  //1.write a program to demonstrate multilevel inheritance. 
}