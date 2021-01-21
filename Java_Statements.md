# Java Statements
<pre>
         
    
    Selection Statements          Iteration Statements          Tranfer Statement
      * if                           * while                       * break
      * if-else                      * do-while                    * continue
      * switch                       * for                         * return
                                                                   * try
</pre>

# Selection Statements:
## if systax:-
<pre>

if (condition){
  if body;
}

The curly brasses are optional whenever we are taking single statements.
The curly brasses are mandatory whenever we are taking multiple statements.

Example:
class Test
{
    public static void main(String[] args)
    {
        int a=10;
        if (a>5)   // if condition should alway return boolean value other you will get either compilation error or runtime exception
        {
            System.out.println("if body / true body");
        }    
    }
}


</pre>
## If-else syntax:-
<pre>
if (condition)
{
    if body;(true body)
}
else
{
    else body;(false body)
}
The curly brasses are optional whenever we are taking single statements.
The curly brasses are mandatory whenever we are taking multiple statements. 

Example

class Test
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        if (a < b)
        {
            System.out.println("if body / true body");
        }
        else
        {
            System.out.println("else body/false body ");
        }
        System.out.println("Hello");
    }
}


</pre>
## Switch statement:-
<pre>
1) Switch statement is used to take multiple selections.
2) Curly brasses are mandatory if we are not taking we are getting compilation error.
3) Inside the switch It is possible to declare any number of cases but is possible to declare only
one default.
4) Switch is taking the argument the allowed arguments are
    a. Byte
    b. Short
    c. Int
    d. Char
    e. String(allowed in 1.7 version)
5) Float and double and long is not allowed for a switch argument because these are having
more number of possibilities (float and double is having infinity number of possibilities)
hence inside the switch statement it is not possible to provide float and double and long as a
argument.
6) If the case is matched particular case will be executed if there is no case is matched default
case is executed.


Syntax:-
switch(argument)
{
 Case label1 : 
     sop(“ “);
     break;
 Case label2 : 
     sop(“ “);
     break;
 ......................
 .....................
 ....................
 Default : 
 sop(“ “);
 break;
}

Eg:
class Test
{
    public static void main(String[] args)
    {
            int a=10;
            switch (a)
            {
            case 10:System.out.println("10");
            break;
            case 20:System.out.println("20");
            break;
            case 30:System.out.println("30");
            break;
            case 40:System.out.println("40");
            break;
            default:System.out.println("default");
            break;
           }
    }
};
Output: 10

</pre>
# Iteration Statements:
# for syntax
<pre>
for (part 1;part 2 ;part 3 )
{
    Body;
}


Ex:- for (initialization ;condition ;increment/decrement )
{
    Body;
}

1) The for loop contains three parts initialization, condition, increment/decrement part.
2) Each and every part is separated by semicolon and it is mandatory.

Ex 1:-normal for loop
class Test
{
    public static void main(String[] args)
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("Rattaiah");
        }
    }
}

Note :
each and every part inside the for loop is optional.
    for(;;)------------represent infinite loop because the condition is always true.


</pre>

## While:-
<pre>
while (condition)
{
    body;
}

Ex :-represent infinite loop
class Test
{
    public static void main(String[] args)
    {
        int i=0;
        while (true)
        {
            System.out.println("hi");
            i++;
        }
    }
}


</pre>

## Do-While:-
<pre>
1) If we want to execute the loop body at least one time them we should go for do-while
statement.
2) In the do-while first body will be executed then only condition will be checked.
3) In the do-while the while must be ends with semicolon otherwise we are getting
compilation error.
4) do is taking the body and while is taking the condition and the condition must be
Boolean condition.

Syntax:-do
{
    //body of loop
} while(condition); 

Ex :-
class Test
{
    public static void main(String[] args)
    {
        int i=0;
        do
        {
            System.out.println("rattaiah");
            i++;
        }while (i<10);
    }
}

</pre>

# Transfer Statements

<pre>
Transfer statements:- by using transfer statements we are able to transfer the flow of execution from
one position to another position .
    1. break
    2. continue
    3. return
    4. try

break:- we are able to use the break statement only two places if we are using any other place the
compiler will raise compilation error.
    a. Inside the switch statement.
    b. Inside the loops.

Ex :-break means stop the execution come out of loop.
class Test
{
    public static void main(String[] args)
    {
        for (int i=0;i<10;i++)
        {
            if (i==5)
            {
                break;
            }
            System.out.println(i);
        }
    }
}


Continue:-(skip the current iteration continue the rest of the iterations normally)
class Test
{
    public static void main(String[] args)
    {
        for (int i=0;i<10;i++)
        {
            if (i==5)
            {
            continue;
            }
            System.out.println(i);
        }
    }
}

</pre>
<pre>

</pre>
