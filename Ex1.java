package Inheritance;

class Parents_ex
{
	int m=85;
}
class Ex1 extends Parents_ex {
	int additional_per = 5;
	public static void main(String args[])
	{
		Ex1 a=new Ex1();
		System.out.println("Total marks : "+(a.m+a.additional_per));
		
	}
}
