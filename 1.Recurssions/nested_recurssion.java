//Nested Recursion
public class nested_recurssion
 {
     static int fun(int n)
      {
        if(n>100)
	         return n-10;
        else
           return fun(fun(n+11));

	     }
      public static void main(String[] args)
       {
         int x=95;
	       int m=fun(x);
         System.out.println(m);
       }
 }
 /*
Output :
         91
  */
