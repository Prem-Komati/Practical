package Inheritance;

class Vehicle
{
	void running()
	{
		System.out.println("running mode on");
	}
}
class Car extends Vehicle
{
	void run()
	{
		System.out.println("car run mode on");
	}
}
class I10 extends Car
{
	void speed()
	{
		System.out.println("speed is very high");
	}
}
public class Multiple_Ex2 {
public static void main(String args[])
{
	I10 i = new I10();
	
	i.running();
	i.run();
	i.speed();
	
}
}
