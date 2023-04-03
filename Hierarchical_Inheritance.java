package Inheritance;


class Operating_System
{
	void Boost()
	{
		System.out.println("Boosting mode on");
	}
}
class windows extends Operating_System
{
	void run()
	{
		System.out.println("run mode on");
	}
}
class linux extends Operating_System
{
	void storage_capacity()
	
	{
		System.out.println("storage capacity is very high");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String args[])
	{
		windows w = new windows();
		w.Boost();
		w.run();
		linux l = new linux();
		l.Boost();
		l.storage_capacity();
	}
}
