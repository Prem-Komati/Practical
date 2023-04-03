package Inheritance;

//Base Class A
class A {
 public void methodA() {
     System.out.println("This is method A from class A");
 }
}

//Derived Class B, which inherits from A
class B extends A {
 public void methodB() {
     System.out.println("This is method B from class B");
 }
}

//Derived Class C, which inherits from B
class C extends B {
 public void methodC() {
     System.out.println("This is method C from class C");
 }
}
public class InheritanceExample {
	public static void main(String[] args) {
        C obj = new C();
        obj.methodA(); // Output: This is method A from class A
        obj.methodB(); // Output: This is method B from class B
        obj.methodC(); // Output: This is method C from class C
    }
}
