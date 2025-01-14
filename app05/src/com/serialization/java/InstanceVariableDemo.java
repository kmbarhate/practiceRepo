package com.serialization.java;
//instance variable or non static variable.

class A {
	int i = 20;

	void k() {
		System.out.println(i);
		System.out.println("from k mehtod");
	}
}

public class InstanceVariableDemo {
	public static void main(String args[]) {
		A a = new A();
		a.k();
		System.out.println(a.i);
		/*
		 * A a1 = null; System.out.println(a1.i);//NPE
		 */	}

}
