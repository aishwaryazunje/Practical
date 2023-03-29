package Method;

public class user_definedEg {
	public void positive_or_not(int number)
	{
		if(number>0) {
			System.out.println("positive");
			
		}
		else 
		{
			System.out.println("negative");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		 int number =sc.nextInt();
		 positive_or_not(number);
	}

}
