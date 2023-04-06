package Inheritance;

public class Aggregation_EX {
public static void main(String args[])
{
	Address a = new Address("Ashti","Beed","India");
	Student s = new Student(01,"ram",a);
	s.show();
	
}
}
