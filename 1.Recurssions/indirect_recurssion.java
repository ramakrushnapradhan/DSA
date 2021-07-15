//Indirect Recursion
public class tree_recurssion
 {
   static void fun(int n)
    {
      if(n>0)
        {
          System.out.println(n);
          funB(n-1);
       }
    }
   static void funB(int n)
    {
     if(n>1)
       {
          System.out.println(n);
          fun(n/2);
       }
     }
   public static void main(String[] args)
       {
         int x=20;
	       fun(x);
       }
 }
 /*
 Output:
     20
     19
      9
      8
      4
      3
      1
  */
