package Assignment;

public class Test_Demo6 {

	public static void main(String[] args)
	{
		Demo6 d6 = Demo6.getDemo6Object();
		System.out.println(d6.a);
		d6.a=30;
		System.out.println("----------------------");
		Demo6 d7 = Demo6.getDemo6Object();
		System.out.println(d7.a);
		d6.a=40;
		Demo6 d8 = Demo6.getDemo6Object();
		System.out.println(d8.a);
		System.out.println("hi");
	}
}
