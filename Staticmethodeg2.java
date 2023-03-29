package assignment;

public class Staticmethodeg2 {
	int m=30;//normal instance variable
	static int n= 20;
	static int add(int a, int b)
	{
		//static method
		return a+b;
	}
	public static void main(String args[])
	{
		int c=Staticmethodeg2.add(5,4);
		System.out.println(c);
		
		Staticmethodeg2 refvar = new Staticmethodeg2();
		System.out.println(refvar.m);// m is static variable
		System.out.println(n);// static variable
	}

}
