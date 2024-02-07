package com.test.addition;

public class AddMain extends Addition {
	public static void main(String[] args) {
		
System.out.println("main method");
		int a=10;
		int b=20;
		
		AddMain am = new AddMain();
		System.out.println("before calling child class");
		int c=am.students(a, b);
		
		System.out.println("after calling child methd");
		System.out.println(c);
		System.out.println("c value");
	}

}
