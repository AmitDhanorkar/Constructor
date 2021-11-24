package com.practice.constructor;

class Student {

	String name;
	int rollNo;
	
	Student(String name, int rollNo) {//Main purpose of constructor is to perform initialization of an object
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public static void main(String[] args) {
		Student std = new Student("Akshay", 100);
		Student std1 = new Student("Ajay", 101);
		System.out.println(std.toString());
		System.out.println(std1.toString());
	}

	@Override
	public String toString() {
		return "Student Details - Name : "+name+", Roll Number : "+rollNo;
	}
}
