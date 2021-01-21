# Arrays:
<pre>
1) Array is a final class inheritance is not possible.
2) Arrays are used to store the multiple numbers of elements of single type.
3) The length of the array is established at the time of array creation. After creation the length is
fixed.
4) The items presented in the array are classed elements. Those elements can be accessed by index
values. The index is begins from (0).

Advantages of array:-
    1) Length of the code will be decreased
    2) We can access the element present in the any location.
    3) Readability of the code will be increased.

</pre>
![alt text](https://raw.githubusercontent.com/ShubhamXD/Java/main/img/array.png)
<pre>
declaration & instantiation & initialization :-
approach 1:-  int a[]={10,20,30,40};
approach 2:-  int[] a=new int[100];
              a[0]=10;
              a[1]=20;
              a[2]=30;
              a[4]=40;
              
              
              
Ex:-printing the array elements
class Test
{
  public static void main(String[] args)
  {
      int[] a={10,20,30,40};
      System.out.println(a[0]);
      System.out.println(a[1]);
      System.out.println(a[2]);
      System.out.println(a[3]);
  }
}

declaration of two dimensional array:-
    int[][] a;
    int [][]a;
    int a[][];
    int []a[];
    
Ex:-
class Test
{
    public static void main(String[] args)
    {
        int[][] a={{10,20,30},{40,50,60}};
        System.out.println(a[0][0]);//10
        System.out.println(a[1][0]);//40
        System.out.println(a[1][1]);//50
    }
}

</pre>
