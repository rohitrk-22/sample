package Assignment;
/*Q7. Write a Java program to show difference between getClass( ) method and instanceof operator.*/
public class Demo7 {

	public static void main(String[] args) {
		
		Demo7 d17 = new Demo7();
		
		System.out.println( "Using getClass() method");
		System.out.println( d17.getClass());
		System.out.println("---------------------------------");
		System.out.println( "Using instanceof operator");
		System.out.println(d17 instanceof Demo7);
		d17= null;
		System.out.println(d17 instanceof Demo7);

	}

}
