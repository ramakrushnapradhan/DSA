//Head Recursion
public class head_recursion
 {
     static void fun(int n)
      {
        if(n>0)
	         {
             fun(n-1);
	           System.out.println(n);
	         }
	     }
      public static void main(String[] args)
       {
         int x=3;
	       fun(x);
       }
<<<<<<< Updated upstream
 }/*
=======
 }
/*
>>>>>>> Stashed changes
Output :
         1
         2
         3
<<<<<<< Updated upstream
*/
=======
*/
>>>>>>> Stashed changes
