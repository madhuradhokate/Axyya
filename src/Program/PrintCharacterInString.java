package Program;

public class PrintCharacterInString 

{
   public static void main(String[] args)
   {
	   String name ="Madhura Vijay Dhokate";
	   
	   for(int i=0; i<name.length(); i++)
	   {
		   if(name.charAt(i)!=' ')
		   {
			   System.out.println(name.charAt(i));
		   }
	   }
	   
   }
}
