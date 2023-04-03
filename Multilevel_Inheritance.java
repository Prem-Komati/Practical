package Inheritance;

class Parent
{
	void show()

{
		System.out.println("it is parent class");
		}
}
class child1 extends Parent
{
	void display()

{
		System.out.println("it is child class 1");
		}
}
class child2 extends child1
{
	void display1()

{
		System.out.println("it is child class 2");
		}
}
public class Multilevel_Inheritance {
	public static void main(String args[])
	{
		child2 c = new child2();
		c.show();
		c.display1();
		c.display();
		
	}
}
