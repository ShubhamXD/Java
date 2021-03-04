import java.util.Scanner;
class prime{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number :");
        boolean chk=false;
        int a=in.nextInt();
        for(int i=2;i<a;i++){
            if(a%i == 0){
                chk=true;
                break;
            }
        }
        if(!chk)
            System.out.println(a+":"+"is a prime Number");
        else
            System.out.println("Entered Number is not a Prime Number");
    }
}


//WAP in java Program to accepts two numbers (int) as command line arguments and print their Sum
//Write a java program to check prime number from command line arguments
//Write a program to add two sqaure matrix
//a 10 20     b 30 40    c[0][0]=a[0][0] + b[0][0];
//  10 20  +    30 40
//    c
//    40 60
//    40 60
////Write a program to multiply two sqaure matrix


