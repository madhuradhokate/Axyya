package Program;

public class LocalInstanceStaticVariable 

{
	 static int a=10; // Static variable
	        int b=20; //non-static variable
	 
    public static void main(String[] args)
    {
    	int c=30; //local variable
    	System.out.println(c);
    	System.out.println(LocalInstanceStaticVariable.a);
    	
    	LocalInstanceStaticVariable x= new LocalInstanceStaticVariable();
    	
    	System.out.println(x.b);
    	
    }
}
