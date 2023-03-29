package assignment;
// till jdk 1.6is posiibble that without main we can executed static block
// jdk 1.7 onwards it is not possible to executed a java code without main()

public class Static_block {
	static {
		System.out.println("Static block executed");
	}
	public static void main(String args[])
	{
		System.out.println("main method executed");
	}

}
