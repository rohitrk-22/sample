package Assignment;
/*Q3. Write a program to demonstrate object class inbuilt functions.*/
public class Demo3 
{
	int a = 50;
	public static void main(String[] args) 
	{
		Demo3 d3= new Demo3();
		System.out.println("Object address using toString() method"); //returns fully qualified address of an object
		System.out.println(d3.toString());
		System.out.println("-----------------------------------------------");
		System.out.println("Object address using hashCode() method"); //returns  address of an object in decimal format
		System.out.println(d3.hashCode());
		System.out.println("-----------------------------------------------");
		System.out.println("Object belongs to:"+ d3.getClass().getName());
		System.out.println("-----------------------------------------------");
		System.out.println("Using equals method");
		String s1 = "Hi";
		String s2 = "Bye";
		String s3 = "Hi";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("-----------------------------------------------");
		System.out.println("Using finalize method");
		System.out.println(new Demo3());
		System.out.println(d3.a);
		d3=null;
		System.gc();  //garbage collector
	}
    @Override
    protected void finalize() throws Throwable
    {
	super.finalize();
	System.out.println("Object distroyed...");
    }
}
