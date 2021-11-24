package com.practice.constructor;

public class ApplicableAccessModifierForConstructor {

	/*
	 * NOTE : The only applicable modifier for the constructor are public, protected, private and default
	 */
	
	public ApplicableAccessModifierForConstructor() {
		System.out.println("Public Access Modifier is applicable for Constructor ");
	}



	ApplicableAccessModifierForConstructor(int i) {
		System.out.println("Default Access Modifier is applicable for Constructor ");
	}



	private ApplicableAccessModifierForConstructor(double d) {
		System.out.println("Private Access Modifier is applicable for Constructor ");
	}



	protected ApplicableAccessModifierForConstructor(float f) {
		System.out.println("Protected Access Modifier is applicable for Constructor "); 
	}


	public static void main(String[] args) {
		ApplicableAccessModifierForConstructor publicConstructor = new ApplicableAccessModifierForConstructor();
		ApplicableAccessModifierForConstructor defaultConstructor = new ApplicableAccessModifierForConstructor(10);
		ApplicableAccessModifierForConstructor privateConstructor = new ApplicableAccessModifierForConstructor(10.5);
		ApplicableAccessModifierForConstructor protectedConstructor = new ApplicableAccessModifierForConstructor(1.5f);

	}

}

