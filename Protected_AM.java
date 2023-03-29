package Access_mod;
import package_eg.Protected_AM_Tst;
//if we want to access protected method ,it is possible in only inheritance

public class protected_AM extends Protected_AM_Tst
{
	public static void main(String args[])
	{
		protected_AM obj = new protected_AM();
	  obj.result();	
	}

}
