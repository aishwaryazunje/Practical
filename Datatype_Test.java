class Datatype_Test
{
int a;
short b;
long c;
double g;
float h;
char m;
void show()
{
Ststem.out.println( "int" +a );
Ststem.out.println( "short" +b );
Ststem.out.println( "long" +c );
Ststem.out.println( "double :" +g );
Ststem.out.println( "float" +h );
Ststem.out.println( "char" +m );
}
public static void main(String args[])
{
Datatype_Test object = new Datatype_Test();
System.out.println( " The default values are given below:");
object.show();
}
}
