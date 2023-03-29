package assignment;

public class StaticMethod1 {// class 1
	//Instance variable
	int rollno;
	String name;
	float fee;
	static String college="Afpit";// static variable
	static void change(){
		//static method
	college="SEM";}
	
	//parameterized contructor
	StaticMethod1(int rollno, String name ,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
		
		//user defined method
		void display(){
			System.out.println(rollno+" "+name+" +"fee+" "+college);
		}
		public class StaticMethod
		{
			public static void main(String args[])
			{
				// no need to create obj for static method
				// calling static method with class name 
				StaticMethod1.change();
				// creating object
				StaticMethod1 s1=new StaticMethod1(102,"ram",5000);
				StaticMethod1 s2=new StaticMethod1(102,"sham",4000);
				s1.display();
				s2.display();
			
				
			}
	}


}
