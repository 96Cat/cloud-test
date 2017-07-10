package com.akko.pojo;

public class User {
	
	static int count = 0;
	
	final int id = count++;

	String name;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		User.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public User() {
		super();
	}

}
