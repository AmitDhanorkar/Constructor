package com.practice.constructor;

public class ThisAndSuperInConstructor {

	public ThisAndSuperInConstructor() {
		System.out.println("Constructor");
		
		/*
		 * If we use super() or this() anywhere else except first line in constructor will throw Compile time error
		 * as Constructor call must be the first statement in a constructor
		 */
		//super();
	}
	
	public ThisAndSuperInConstructor(int i) {
		super();
		/*
		 * We can use either super() or this() but not both simultaneously
		 */
		//this();
	}
	
	public void testMethod() {
		/*
		 * super() and this() are only usable inside constructor if we used outside constructor it will throw compile time error
		 */
		//super();
		System.out.println("Method");
	}
}
