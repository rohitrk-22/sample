package Assignment;
/*Q1. Write a java program to hide address of object.*/

public class Demo1 
{
   @Override
   public String toString()
    {
	return "Object address hidden";
    }
	public static void main(String[] args) 
	{
		Demo1 d1= new Demo1();
		System.out.println(d1);
	}
}
