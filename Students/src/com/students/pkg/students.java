package com.students.pkg;

public class students {

	private String name;
	private int rollNumber;
	private int age;
	private int marks;

	public void setDetails(String name, int rollNumber, int age, int marks) {
		boolean flag = false;

		if (age >= 18 && age < 60 && marks > 0 && marks < 500) {
			this.name = name;
			this.rollNumber = rollNumber;
			this.age = age;
			this.marks = marks;
			flag = true;
		}

		if (flag) {
			System.out.printf(" name : %s , roll:  %d , age :  %d, marks :  %d", name, rollNumber, age, marks)
					.println();
		} else {
			System.out.println("This is not acceptable");
		}
	}

}
