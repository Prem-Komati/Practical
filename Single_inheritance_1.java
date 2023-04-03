package Inheritance;

class Parent
{
	void show()

{
		System.out.println("it is parent class");
		}
}
class child extends Parent
{
	void display()

{
		System.out.println("it is child class");
		}
}
public class Single_inheritance_1 {
public static void main(String args[])
{
	child c = new child();
	c.display();
	c.show();
}
}
