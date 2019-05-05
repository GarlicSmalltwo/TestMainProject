package com.qixin.test;

public class ClassTestMain {
          public static void main(String[] args) {
			A ab=new B();
			ab=new B();
		}
}

class A{
	static {
		System.out.println("a");
	}
	public A() {
		System.out.println("1");
	}
}

class B extends A{
	static {
		System.out.println("b");
	}
	public B(){
		System.out.println("2");
	}
}