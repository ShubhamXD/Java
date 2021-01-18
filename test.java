import java.util.Scanner;
class test{
    public static void main(String...arg){  //String[] arg
        System.out.println("Test");  //System is a class, out is its object and print is a method of System class
        Scanner input=new Scanner(System.in);
        int a,b;
        a=input.nextInt(); // String nextLine()
        b=input.nextInt();
        System.out.println("A:"+a+"   B:"+b);
    }
}