package package1;

public class This_Pgm {

	public static void main(String[] args) {
		This_Pgm t=new This_Pgm();
		t.instance();
		//t.instance(3);
	}
	public void instance()
	{
		this.sample();
		this.instance(3);
	System.out.println("This");
	}
	public void instance(int a)
	{
		System.out.println(a);
	}

	public void sample()
	{
		System.out.println("a");
	}

}
