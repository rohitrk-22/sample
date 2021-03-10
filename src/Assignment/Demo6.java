package Assignment;
/*Q6. Write a Java program to restrict non static block and constructor execution for multiple object creation.*/
public class Demo6 
{
   static Demo6 d1;
   int a = 20;
   
   private Demo6()
   {
	   System.out.println("Running private constructor");
   }
   {
	   System.out.println("Running non static block");
   }
   void display()
	   {
		   System.out.println("Running display method");
	   }
   static Demo6 getDemo6Object()
   {
	   if(d1==null)
	   {
		   d1=new Demo6();
	   }
	   return d1;
   }
   
}

