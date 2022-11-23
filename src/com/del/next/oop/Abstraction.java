package com.del.next.oop;

abstract class Test{
	abstract void eat();
}

class B extends Test{
	void eat() {
		System.out.println("hi");
	}
public static void main(String[]args) {
	B j = new B();
	j.eat();
}
}