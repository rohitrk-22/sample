package Assignment;

public class Test_Demo {

	public static void main(String[] args) 
	{
		Demo4 d4 = new Demo4();
		System.out.println("with overrided method");
		System.out.println(d4.toString());
		System.out.println(d4.hashCode());
		System.out.println("-----------------------------");
		System.out.println("without overrided method");
		Demo5 d5 = new Demo5();
		System.out.println(d5.toString());
		System.out.println(d5.hashCode());
	}
}
