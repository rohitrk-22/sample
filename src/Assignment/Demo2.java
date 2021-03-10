package Assignment;
/*Q2.Write a Java program to show difference between toString( ) and hashCode( ).*/
public class Demo2 
{
	public static void main(String[] args) 
	{
		Demo2 d2= new Demo2();
		System.out.println("toString() method"); //returns fully qualified address of an object
		System.out.println(d2.toString());
		
		System.out.println("------------------------------");
		
		System.out.println("hashCode() method"); //returns  address of an object in decimal format
		System.out.println(d2.hashCode());
	}
}
