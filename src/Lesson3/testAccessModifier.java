package Lesson3;

class Firstclass{
	public int a;
	private int b;


private void display ()
{
	System.out.println("This is a test");
}

public void setvalue (int x, int y)
{
	a=x;
	b=y;
}

void getvalue()
{
	System.out.println("This is a test of Access: and values are" + a +b);
}

}
public class testAccessModifier {
 public static void main (String [] args)
 {
	 Firstclass fc = new Firstclass();
	 MyClass1 fc1 = new MyClass1();
	 fc.setvalue(1,2);
	 fc.getvalue();
	 fc.a=3;
	 fc.getvalue();
	 fc1.setValue(2, 3, 4, 5);
	 fc1.getvalue();
 }
}
