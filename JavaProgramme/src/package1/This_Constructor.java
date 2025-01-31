package package1;

public class This_Constructor {


	public static void main(String[] args) {
		This_Constructor obj =new This_Constructor();
		//This_Constructor obj1 =new This_Constructor(3);
		//This_Constructor obj2 =new This_Constructor(0.6f);

	}
public This_Constructor()
{
	this(2);
	System.out.print("a");
}
public This_Constructor(int a)
{
	this(3.4f);
	System.out.println(a);
}
public This_Constructor(float a)

{
	System.out.println(a);
}
}
