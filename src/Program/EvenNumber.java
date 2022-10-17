package Program;

import java.util.Scanner;

public class EvenNumber

{
	

  public static void main(String[] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int num= sc.nextInt();
	  
	  System.out.println("Enter the num from 1 to" + num +" are :");
	  
	  for(int i=0; i<=num; i++)
	  {
		  if(i%2==0)
		  {
			  System.out.println(i);
		  }
	  }
  }
}
