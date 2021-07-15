//Tree Recursion
public class tree_recurssion
 {
     static void fun(int n)
      {
        if(n>0)
	         {
             System.out.println(n);
             fun(n-1);
             fun(n-1);
	         }
	     }
      public static void main(String[] args)
       {
         int x=3;
	       fun(x);
       }
 }/*
Output :
     3 
     2
     1
     1
     2
     1
     1

*/
