package Program;

import java.util.Scanner;

public class FibonacciSeries 
{
//  public static void main(String[] args)
//  {
//   int no=10;
//   int a=1;
//   int b=0;
//   int c=0;
//   
//   for(int i=1;i<=no; i++)
//   { 
//	   c= a+b;
//	   System.out.println(c);
//	   a=b;
//	   b=c;	   
//	  
//   }
	  
	  
	    static int n1=0,n2=1,n3=0;
	    public static void fib(int a){
	        if(a>0){
	            n3 = n1+n2;
	            n1 = n2;
	            n2 = n3;
	            System.out.print(" "+n3);
	            fib(a-1);
	        }
	    }
	    public static void main(String[] args){
	        Scanner s = new Scanner(System.in);
	        fib(s.nextInt()-2);
	    }
//  } 
}
