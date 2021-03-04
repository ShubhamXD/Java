class Test1{
    int a; //instance variable
    int b;  //
    static int c; //static variable
    Test1(int a, int b){  // this operator
        this.a=a;
        this.b=b;
    }
    int add(int x, int y){
        return x+y;
    }
    int max(int x, int y){
        return x>y?x:y;
    }
    public static void main(String[] args) {
        Test1 t1;  //t1 is a referance of class Test1
        t1=new Test1(10,20);
        int d=t1.add(t1.a,t1.b);
        System.out.println(d);
    }
}
// Create a class which have methods sum,max, min 
//and multiplication and use them with the help of object(s).