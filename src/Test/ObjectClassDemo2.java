package Test;


class Demo2
{
private double a, b;
Demo2(double a, double b)
{
this.a = a;
this.b = b;
}
@Override
public String toString()
{
return String.format(a+" + i "+b);
}
}
public class ObjectClassDemo2
{
public static void main(String args[])
{
Demo2 d2 = new Demo2(2.2, 4.2);
System.out.println(d2);
}
}