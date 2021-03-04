import java.util.Scanner;
public class addmatrix
{
    public static void main(String[] args)
    {
    
       int first[][] = new int[3][3];
       int second[][] = new int[3][3];
       int sum[][] = new int[3][3];

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the value of first 3 by 3 Matrix ");
       for(int i=0;i<3;i++)
       {
           for(int j= 0;j<3;j++)
           {
               first[i][j] = sc.nextInt();

           }
       }
       System.out.println("Enter second value of 3 by 3 matrix");
       for(int i=0;i<3;i++)
       {
        for( int j=0;j<3;j++)
        {
            second[i][j] = sc.nextInt();

        }
       }

       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               sum[i][j] = first[i][j] + second[i][j];
           }
       }

       //Display
       System.out.println("Sum of two square matrix:");
       for(int i=0;i<3;i++)
           {
               for(int j=0;j<3;j++)
               {
                   System.out.print(sum[i][j]+" ");
               }
               System.out.println();
           }
       


    }
}