package Abstraction;

public class Parentabs {
	Parentabs()
	{
		System.out.println("No-args Cons");
		}
	abstract void show();
	void run()
	{
		System.out.println("Non abstacr method");
		
	}
	public child extends Parentabs
	{
		void show();
		{
			System.out.println("Parent class abstract method");
		}
	}
public class AbstractClassEg
{
	public static void main(String args[])
	{
		Parent object = new Childabs();
		object.show();
		object.run();
	}
		
	}


