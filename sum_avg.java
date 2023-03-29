package Method;

import java.util.Scanner;
public class sum_avg
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("1s no:");
double x=in.nextDouble();
System.out.println("2nd no:");
double y=in.nextDouble();
System.out.println("3rd no:");
double z=in.nextDouble();

System.out.println("the average value is"+average(x,y,z)+"\n");
}
public static double average(double x,double y,double z)
{
return(x+y+z)/3;
}
}