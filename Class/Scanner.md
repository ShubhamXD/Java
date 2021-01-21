# Scanner Class
<pre>
To get the instance of Java Scanner which reads input from the user, 
we need to pass the input stream (System.in) in the constructor of Scanner class. 
For Example:
  Scanner in = new Scanner(System.in);  


Method          Description
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user
next()	    It is used to get the next complete token from the scanner which is in use.
hasNext() 	It returns true if this scanner has another token in its input.
close()   	It is used to close this scanner.



</pre>
<pre>
import java.util.*;  
public class ScannerExample {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.nextLine();  
          System.out.println("Name is: " + name);             
          in.close();             
          }  
} 
</pre>

