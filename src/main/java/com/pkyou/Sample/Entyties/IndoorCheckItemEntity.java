package com.pkyou.Sample.Entyties;

import java.io.Serializable;

public class IndoorCheckItemEntity implements Serializable {
	private static final long serialVersionUID = -6556793741331167103L;
	private int id;
	private int age;
	private String name;
	private String chineseName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getChineseName() {
		return chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
}
