package Abstraction;

public interface Shape {
	void shape_name();
}
class User_circle implements Shape
{
	public void shape_name()
	{
		System.out.println("Draw a circle");
		}
}
class User_Triangle implements Shape
{
	public void shape_name()
	{
		System.out.println("Draw a Triangle");
		}
	}
 class Interfaceeg2
{
	public static void main(String args[])
	{
		Shape object = new User_Triangle();
		object.shape_name();
	}
 }

