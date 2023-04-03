package Inheritance;

class Arithmetic
{
	int add(int a,int b)
	{
		return a+b;
	}
}
class Adder extends Arithmetic
{
	
}
public class Ex2 {
	 public static void main(String[] args) {
	        Adder a = new Adder();//creating object
	        int sum = a.add(22, 23); // 
	        System.out.println("sum : "+sum);
	    }
}
