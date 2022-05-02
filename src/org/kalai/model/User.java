package org.kalai.model;

public class User {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}
